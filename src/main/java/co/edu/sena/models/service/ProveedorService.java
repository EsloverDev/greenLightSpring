package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.sena.models.entity.Proveedor;

public interface ProveedorService {

	public Optional<Proveedor> findById(Integer id);
	public List<Proveedor> findAll();
	public Proveedor save(Proveedor p);
	public void deleteById(Integer id);
	public String login(String email, String ctr);
}
