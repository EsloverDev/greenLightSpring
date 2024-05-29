package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.repository.Tipo_documentoRepository;

@Service
public class Tipo_documentoServiceImpl implements Tipo_documentoService {

	@Autowired
	Tipo_documentoRepository tipo_documentoRepository;
}
