package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Perfil;
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
	public String login(String perfil, String ctr) {
		Perfil per = perfilRepository.findByUsername(perfil);
		
		if (per == null) {
			return "Usuario no encontrado";
		}
		if (!per.getPassword().equals(ctr)) {
			return "Contraseña incorrecta";			
		}
		return "Inicio de sesión exitoso";
	}

	
}
