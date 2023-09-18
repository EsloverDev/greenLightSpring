package co.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.sena.models.entity.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {

	Perfil findByUsername(String perfil);
}
