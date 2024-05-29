package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.sena.models.entity.Persona;

public interface PersonaService {

	public Optional<Persona> findById(Integer id);
	public List<Persona> findAll();
	public Persona save(Persona p);
	public void deleteById(Integer id);
	public Optional<Persona> encontrarCorreo(String email);
	public Persona update(Persona p);
	public String login(String persona, String ctr);
}
