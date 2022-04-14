package umu.tds.dao;


public abstract class DAOFactory {
	
	// Implementacion con SINGLETON
		private static DAOFactory unicaInstancia;
		
		// Metodos SINGLETON
		public static DAOFactory getUnicaInstancia(String tipo) throws DAOException{
			if (unicaInstancia == null){
				try {
					unicaInstancia=(DAOFactory) Class.forName(tipo).newInstance();
				}
				catch (Exception e){	
					throw new DAOException(e.getMessage());
				}
			}
			return unicaInstancia;
		}
		
		public static DAOFactory getUnicaInstancia() throws DAOException{
			return getUnicaInstancia("tds.dao.AdaptadorFactoriaDAOTDS");
		}
		
		// Constructor
		protected DAOFactory (){}
		
		// GETTER
		public abstract DAOVideos getVideos();
		public abstract DAOUsuario getUsuario();
		public abstract DAOListaVideos getListaVideos();

}
