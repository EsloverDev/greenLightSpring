package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "capacitacion")
public class Capacitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ruta_capacitacion")
	private String rutaDeAprendizaje;

	public Capacitacion() {
		
	}

	public Capacitacion(int id, String nombre, String rutaDeAprendizaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rutaDeAprendizaje = rutaDeAprendizaje;
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

	public String getRutaDeAprendizaje() {
		return rutaDeAprendizaje;
	}

	public void setRutaDeAprendizaje(String rutaDeAprendizaje) {
		this.rutaDeAprendizaje = rutaDeAprendizaje;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre=" + nombre + ", rutaDeAprendizaje=" + rutaDeAprendizaje + "]";
	}
	
}
