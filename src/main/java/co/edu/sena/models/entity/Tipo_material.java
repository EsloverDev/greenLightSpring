package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_material")
public class Tipo_material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "tipo_material_id")
	private Embalaje embalaje;

	public Tipo_material() {
		
	}

	public Tipo_material(int id, String nombre, Embalaje embalaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.embalaje = embalaje;
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

	public Embalaje getEmbalaje() {
		return embalaje;
	}

	public void setEmbalaje(Embalaje embalaje) {
		this.embalaje = embalaje;
	}

	@Override
	public String toString() {
		return "Tipo_material [id=" + id + ", nombre=" + nombre + ", embalaje=" + embalaje + "]";
	}
	
}
