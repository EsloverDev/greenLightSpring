package co.edu.sena.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "embalaje")
public class Embalaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "embalaje")
	private List<Tipo_material> materiales;

	public Embalaje() {
		
	}

	public Embalaje(int id, String nombre, List<Tipo_material> materiales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.materiales = materiales;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tipo_material> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<Tipo_material> materiales) {
		this.materiales = materiales;
	}

	@Override
	public String toString() {
		return "Embalaje [id=" + id + ", nombre=" + nombre + ", materiales=" + materiales + "]";
	}
	
}
