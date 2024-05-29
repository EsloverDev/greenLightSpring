package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.repository.LocalidadRepository;

@Service
public class LocalidadServiceImpl implements LocalidadService {

	@Autowired
	LocalidadRepository localidadRepository;
}
