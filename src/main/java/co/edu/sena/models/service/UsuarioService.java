package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.sena.models.entity.Usuario;

public interface UsuarioService {

	public Optional<Usuario> findById(Integer id);
	public List<Usuario> findAll();
	public Usuario save(Usuario u);
	public void deleteById(Integer id);
}
