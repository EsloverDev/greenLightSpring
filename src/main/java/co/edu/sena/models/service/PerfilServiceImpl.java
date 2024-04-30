package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Perfil;
import co.edu.sena.models.entity.Proveedor;
import co.edu.sena.repository.PerfilRepository;

@Service
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	PerfilRepository perfilRepository;
	
	@Override
	public Perfil save(Perfil p) {
		return perfilRepository.save(p);
	}

	@Override
	public Optional<Perfil> findById(Integer id) {
		return perfilRepository.findById(id);
	}

	@Override
	public List<Perfil> findAll() {
		return perfilRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		perfilRepository.deleteById(id);
	}

	@Override
	public Optional<Perfil> encontrarCorreo(String email) {
		return perfilRepository.encontrarCorreo(email);
	}
	
	@Override
	public Perfil update(Perfil p) {
		return perfilRepository.save(p);
	}
	
	@Override
	public String login(String perfil, String ctr) {
		Perfil per = perfilRepository.findByEmail(perfil);
		
		if(per == null) {
			return "Usuario no encontrado";
		}
		if(!per.getPassword().equals(ctr)) {
			return "Contraseña incorrecta";
		}
		return "Bienvenido";
	}

}
