package co.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.sena.models.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{

	@Query("SELECT p FROM Proveedor p WHERE p.per.email = :email")
	Proveedor findByPerfilEmail(@Param("email") String email);
}
