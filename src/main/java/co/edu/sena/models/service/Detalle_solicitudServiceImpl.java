package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.repository.Detalle_solicitudRepository;

@Service
public class Detalle_solicitudServiceImpl implements Detalle_solicitudService {

	@Autowired
	Detalle_solicitudRepository detalle_solicitudRepository;
}
