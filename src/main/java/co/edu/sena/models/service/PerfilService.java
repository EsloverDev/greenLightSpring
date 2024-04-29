package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.sena.models.entity.Perfil;

public interface PerfilService {

	public Optional<Perfil> findById(Integer id);
	public List<Perfil> findAll();
	public Perfil save(Perfil p);
	public void deleteById(Integer id);
	/*public Optional<Perfil> findByEmail(String email);*/
	public Perfil update(Perfil p);
	public String login(String perfil, String ctr);
}