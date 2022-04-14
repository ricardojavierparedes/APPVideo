package umu.tds.dao;

import java.util.List;
import umu.tds.dominio.Video;

public interface DAOVideos {
	
	/**
	 * Metodos DAO
	 */
	
	public void add(Video videos);
	public void delete(int id);
	public Video get(int id);
	public List<Video> getAll();
	

}
