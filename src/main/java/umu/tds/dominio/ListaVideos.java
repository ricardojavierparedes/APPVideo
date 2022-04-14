package umu.tds.dominio;

import java.util.LinkedList;
import java.util.List;

public class ListaVideos {
	
	private int id;
	private String nombre;
	
	private List<Videos> videos;
	
	public ListaVideos(String nombre) {
		this.nombre = nombre;
		this.videos = new LinkedList<Videos>();
	}
	
	public ListaVideos(String nombre, List<Videos> lista) {
		this.nombre = nombre;
		this.videos = new LinkedList<Videos>(lista);
	}
	
	public ListaVideos(String nombre, LinkedList<Videos> lista) {
		this.nombre = nombre;
		this.videos = lista;
	}

	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Videos> getVideos() {
		return videos;
	}
	
	public void addVideo(Videos video) {
		this.videos.add(video);
	}
	
}
