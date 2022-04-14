package umu.tds.dao;

/**
 * Factoria abstracta DAO.
 */

public abstract class FactoriaDAO {
	
	public static final String DAO_TDS = "umu.tds.dao.TDSFactoriaDAO";

	private static FactoriaDAO unicaInstancia = null;
	
	/** 
	 * Crea un tipo de factoria DAO.
	 * Solo existe el tipo TDSFactoriaDAO
	 */
	public static FactoriaDAO getunicaInstancia(String tipo) throws DAOException{
		if (unicaInstancia == null)
			try { 
				unicaInstancia=(FactoriaDAO) Class.forName(tipo).newInstance();
			} catch (Exception e) {	
				throw new DAOException(e.getMessage());
		} 
		return unicaInstancia;
	}
	

	public static FactoriaDAO getunicaInstancia() throws DAOException{
		return getunicaInstancia(FactoriaDAO.DAO_TDS);
	}

	protected FactoriaDAO (){}
	
	// Metodos factoria para obtener adaptadores

	public abstract DAOVideos getVideosDAO();
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract DAOListaVideos getListaVideosDAO();
}
