package co.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.sena.models.entity.Recolector;

public interface RecolectorRepository extends JpaRepository<Recolector, Integer>{

	@Query("SELECT r FROM Recolector r WHERE r.per.email = :email")
	Recolector findByPerfilEmail(@Param("email") String email);

}
