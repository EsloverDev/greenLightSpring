package co.edu.sena.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.sena.models.entity.Barrio;

public interface BarrioRepository extends JpaRepository<Barrio, Integer>{

	@Query(value = "select * from barrio where localidad_id = :localidad_id", nativeQuery = true)
	List<Barrio> buscarBarrioPorLocalidad(int localidad_id);
}
