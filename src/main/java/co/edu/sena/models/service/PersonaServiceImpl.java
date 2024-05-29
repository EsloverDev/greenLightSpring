package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Persona;
import co.edu.sena.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	PersonaRepository personaRepository;

	@Override
	public Persona save(Persona p) {
		return personaRepository.save(p);
	}

	@Override
	public Optional<Persona> findById(Integer id) {
		return personaRepository.findById(id);
	}

	@Override
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		personaRepository.deleteById(id);
	}

	@Override
	public Optional<Persona> encontrarCorreo(String email) {
		return personaRepository.encontrarCorreo(email);
	}

	@Override
	public Persona update(Persona p) {
		return personaRepository.save(p);
	}

	@Override
	public String login(String persona, String ctr) {
		Persona per = personaRepository.findByEmail(persona);
		
		if(per == null) {
			return "Usuario no encontrado";
		}
		if(!per.getClave().equals(ctr)) {
			return "Contraseña incorrecta";
		}
		return "Bienvenido";
	}
	
}
