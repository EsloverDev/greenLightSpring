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
@Table(name = "detalle_solicitud")
public class Detalle_solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "peso_material")
	private int peso;
	
	@ManyToOne
	@JoinColumn(name = "embalaje_id")
	private Embalaje embalaje;
	
	@ManyToOne
	@JoinColumn(name = "solicitud_id")
	private Solicitud solicitud;

	public Detalle_solicitud() {
		
	}

	public Detalle_solicitud(int id, int peso, Embalaje embalaje, Solicitud solicitud) {
		super();
		this.id = id;
		this.peso = peso;
		this.embalaje = embalaje;
		this.solicitud = solicitud;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Embalaje getEmbalaje() {
		return embalaje;
	}

	public void setEmbalaje(Embalaje embalaje) {
		this.embalaje = embalaje;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	@Override
	public String toString() {
		return "Detalle_solicitud [id=" + id + ", peso=" + peso + ", embalaje=" + embalaje + ", solicitud=" + solicitud
				+ "]";
	}
	
}
