package umu.tds.dao;

import java.util.List;
import umu.tds.dominio.Videos;

public interface DAOVideos {
	
	/**
	 * Metodos DAO
	 */
	
	public void add(Videos videos);
	public void delete(int id);
	public Videos get(int id);
	public List<Videos> getAll();
	

}
