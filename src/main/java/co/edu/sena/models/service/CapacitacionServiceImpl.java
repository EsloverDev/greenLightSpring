package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.repository.CapacitacionRepository;

@Service
public class CapacitacionServiceImpl implements CapacitacionService {

	@Autowired
	CapacitacionRepository capacitacionRepository;
}
