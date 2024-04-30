package co.edu.sena.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.edu.sena.models.entity.Perfil;
import co.edu.sena.models.entity.Proveedor;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

	@Query("SELECT p FROM Perfil p WHERE p.email = :email")
	Optional<Perfil> encontrarCorreo(String email);
	
	Perfil findByEmail(String perfil);
}
