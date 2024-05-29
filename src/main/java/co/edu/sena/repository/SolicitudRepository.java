package co.edu.sena.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.sena.models.entity.Solicitud;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

	@Query(value = "SELECT * FROM solicitud s WHERE s.id = :idSolicitud", nativeQuery = true)
	List<Solicitud> lstBuscarSolicitud(Integer idSolicitud);
}
