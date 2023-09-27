package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.sena.models.entity.Recolector;

public interface RecolectorService {

	public Optional<Recolector> findById(Integer id);
	public List<Recolector> findAll();
	public Recolector save(Recolector r);
	public void deleteById(Integer id);
	public String login(String email, String pass);
}
