package umu.tds.dominio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import umu.tds.dao.DAOException;
import umu.tds.dao.FactoriaDAO;

public class CatalogoVideos {

	// Implementacion con SINGLETON
	private static CatalogoVideos unicaInstancia;

	private Map<String, Video> videoPorId;
	private Map<String, Set<Video>> videoPorTitulo;
	private Map<String, Set<Video>> videoPorEtiquetas;

	// Fatoria
	private FactoriaDAO factoria;

	// Metodo SINGLETONc
	public static CatalogoVideos getUnicaInstancia() {

		if (unicaInstancia == null) {
			unicaInstancia = new CatalogoVideos();
		}

		return unicaInstancia;
	}

	public CatalogoVideos() {
		videoPorId = new HashMap<String, Video>();
		videoPorTitulo = new HashMap<String, Set<Video>>();
		videoPorEtiquetas = new HashMap<String, Set<Video>>();

		try {
			factoria = FactoriaDAO.getunicaInstancia();
			List<Video> listaVideos = factoria.getVideosDAO().getAll();
			listaVideos.stream().forEach(v -> {
				listaVideos.add(v);
			});

		} catch (DAOException eDAO) {
			eDAO.printStackTrace();
		}
	}

	public void add(Video videos) {
		videoPorId.put(videos.getId(), videos);
		videoPorTitulo.get(videos.getTitulo()).add(videos);
		LinkedList<Etiqueta> etiquetas = (LinkedList<Etiqueta>) videos.getEtiquetas();
		etiquetas.stream().forEach(e -> {
			etiquetas.add(e);
			String a = e.getNombre();
			videoPorEtiquetas.get(a).add(videos);
		});
		
	}

}
