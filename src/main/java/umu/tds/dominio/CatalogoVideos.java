package umu.tds.dominio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import umu.tds.dao.DAOException;
import umu.tds.dao.DAOFactory;

public class CatalogoVideos {

	// Implementacion con SINGLETON
	private static CatalogoVideos unicaInstancia;

	private Map<String, Videos> videoPorId;
	private Map<String, Set<Videos>> videoPorTitulo;
	private Map<String, Set<Videos>> videoPorEtiquetas;

	// Fatoria
	private DAOFactory factoria;

	// Metodo SINGLETONc
	public static CatalogoVideos getUnicaInstancia() {

		if (unicaInstancia == null) {
			unicaInstancia = new CatalogoVideos();
		}

		return unicaInstancia;
	}

	public CatalogoVideos() {
		videoPorId = new HashMap<String, Videos>();
		videoPorTitulo = new HashMap<String, Set<Videos>>();
		videoPorEtiquetas = new HashMap<String, Set<Videos>>();

		try {
			factoria = DAOFactory.getUnicaInstancia();
			List<Videos> listaVideos = factoria.getVideos().getAll();
			listaVideos.stream().forEach(v -> {
				listaVideos.add(v);
			});

		} catch (DAOException eDAO) {
			eDAO.printStackTrace();
		}
	}

	public void add(Videos videos) {
		videoPorId.put(videos.getId(), videos);
		videoPorTitulo.get(videos.getTitulo()).add(videos);
		LinkedList<Etiquetas> etiquetas = (LinkedList<Etiquetas>) videos.getEtiquetas();
		etiquetas.stream().forEach(e -> {
			etiquetas.add(e);
			String a = e.getNombre();
			videoPorEtiquetas.get(a).add(videos);
		});
		
	}

}
