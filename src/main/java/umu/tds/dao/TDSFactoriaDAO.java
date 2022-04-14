package umu.tds.dao;

/** 
 * Factoria concreta DAO para el Servidor de Persistencia de la asignatura TDS.
 * 
 */

public final class TDSFactoriaDAO extends FactoriaDAO {
	
	public TDSFactoriaDAO() {	}
	
	@Override
	public TDSUsuarioDAO getUsuarioDAO() {	
		return new TDSUsuarioDAO(); 
	}

	@Override
	public DAOVideos getVideosDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DAOListaVideos getListaVideosDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
