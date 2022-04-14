package umu.tds.dao;

import java.util.List;

import umu.tds.dominio.ListaVideos;

public interface DAOListaVideos {
	public void add(ListaVideos playlist);
	public void delete(int id);
	public ListaVideos get(int id);
	public List<ListaVideos> getAll();

}
