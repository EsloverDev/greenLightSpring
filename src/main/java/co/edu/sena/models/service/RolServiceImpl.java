package co.edu.sena.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Rol;
import co.edu.sena.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolRepository rolRepository;
	
	@Override
	public List<Rol> listarRoles() {
		return rolRepository.findAll();
	}

}
