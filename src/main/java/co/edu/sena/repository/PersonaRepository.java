package co.edu.sena.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.sena.models.entity.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Integer> {

	@Query("SELECT p FROM Persona p WHERE p.email = :correo_electronico")
	Optional<Persona> encontrarCorreo(String correo_electronico);
	
	Persona findByEmail(String persona);
}
