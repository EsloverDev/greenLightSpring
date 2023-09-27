package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recolectores")
public class Recolector {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recolector_id")
	private int id;
	
	@Column(name = "ubicacion")
	private String ubicacionActual;
	
	@Column(name = "estado")
	private String estado;

	@ManyToOne
	private Perfil per;

	public Recolector() {
		
	}

	public Recolector(int id, String ubicacionActual, String estado, Perfil per) {
		
		this.id = id;
		this.ubicacionActual = ubicacionActual;
		this.estado = estado;
		this.per = per;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUbicacionActual() {
		return ubicacionActual;
	}

	public void setUbicacionActual(String ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Perfil getPer() {
		return per;
	}

	public void setPer(Perfil per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Recolector [id=" + id + ", ubicacionActual=" + ubicacionActual + ", estado=" + estado + ", per=" + per
				+ "]";
	}
	
}
