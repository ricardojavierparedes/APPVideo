package umu.tds.dominio;

import java.util.LinkedList;
import java.util.List;

public class ListaVideos {
	
	private int id;
	private String nombre;
	
	private List<Video> videos;
	
	public ListaVideos(String nombre) {
		this.nombre = nombre;
		this.videos = new LinkedList<Video>();
	}
	
	public ListaVideos(String nombre, List<Video> lista) {
		this.nombre = nombre;
		this.videos = new LinkedList<Video>(lista);
	}
	
	public ListaVideos(String nombre, LinkedList<Video> lista) {
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
	
	public List<Video> getVideos() {
		return videos;
	}
	
	public void addVideo(Video video) {
		this.videos.add(video);
	}
	
}
