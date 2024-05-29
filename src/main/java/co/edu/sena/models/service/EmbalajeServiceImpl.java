package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.repository.EmbalajeRepository;

@Service
public class EmbalajeServiceImpl implements EmbalajeService {

	@Autowired
	EmbalajeRepository embalajeRepository;
}
