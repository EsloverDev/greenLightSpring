package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Proveedor;
import co.edu.sena.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	ProveedorRepository proveedorRepository;
	
	@Override
	public Optional<Proveedor> findById(Integer id) {
		return proveedorRepository.findById(id);
	}

	@Override
	public List<Proveedor> findAll() {
		return proveedorRepository.findAll();
	}

	@Override
	public Proveedor save(Proveedor p) {
		return proveedorRepository.save(p);
	}

	@Override
	public void deleteById(Integer id) {
		proveedorRepository.deleteById(id);
	}

	@Override
	public String login(String email, String ctr) {
		Proveedor pro = proveedorRepository.findByPerfilEmail(email);
		if (pro == null) {
			return "Proveedor aún no estás registrado";
		}
		String passwordProveedor = pro.getPer().getPassword();
		if (!passwordProveedor.equals(ctr)) {
			return "contraseña incorrecta";
		}
		return "Bienvenido";
	}

}
