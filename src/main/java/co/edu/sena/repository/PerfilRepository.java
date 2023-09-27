package co.edu.sena.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.sena.models.entity.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

	@Query("SELECT p FROM Perfil p WHERE p.email = :email")
	Optional<Perfil> findByEmail(String email);
}
