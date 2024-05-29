package co.edu.sena.models.service;

import java.util.List;

import co.edu.sena.models.entity.Barrio;

public interface BarrioService {

	public List<Barrio> buscarBarrioPorLocalidad(int localidad_id);
}
