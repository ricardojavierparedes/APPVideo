package umu.tds.dominio;

import java.util.LinkedList;
import java.util.List;

public class Videos {
	

	private String id;
	private String titulo;
	private String url;
	private List<Etiquetas> etiquetas;
	
	public Videos(String titulo, String url, String id) {
		this.titulo = titulo;
		this.etiquetas = new LinkedList<Etiquetas>();
		this.url = url;
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public List<Etiquetas> getEtiquetas() {
		return this.etiquetas;
	}

	@Override
	public String toString() {
		return Videos.class + " [titulo=" + titulo + ", etiquetas=" + etiquetas + ", url=" + url + "]";
	}
		

}
