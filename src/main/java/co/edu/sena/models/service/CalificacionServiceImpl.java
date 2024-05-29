package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.repository.CalificacionRepository;

@Service
public class CalificacionServiceImpl implements CalificacionService {

	@Autowired
	CalificacionRepository calificacionRepository;
}
