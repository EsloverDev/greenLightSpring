package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.repository.Tipo_materialRepository;

@Service
public class Tipo_materialServiceImpl implements Tipo_materialService {

	@Autowired
	Tipo_materialRepository tipo_materialRepository;
}
