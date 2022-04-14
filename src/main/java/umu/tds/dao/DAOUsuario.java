package umu.tds.dao;

import java.util.List;

import umu.tds.dominio.Usuario;

public interface DAOUsuario {
	
	/**
	 * Metodos DAO
	 */
	
	public void add(Usuario usuario);
	public void delete(String username);
	public void delete(Usuario usuario);
	public Usuario get(String username);
	public List<Usuario> getAll();
	

}
