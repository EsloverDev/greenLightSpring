package co.edu.sena.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Barrio;
import co.edu.sena.repository.BarrioRepository;

@Service
public class BarrioServiceImpl implements BarrioService {

	@Autowired
	BarrioRepository barrioRepository;

	@Override
	public List<Barrio> buscarBarrioPorLocalidad(int localidad_id) {
		return barrioRepository.buscarBarrioPorLocalidad(localidad_id);
	}
}
