package co.edu.sena.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "calificacion")
public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "calificacion_solicitud")
	private int calificacionProveedor;
	
	@Column(name = "fecha_calificacion_solicitud")
	private Date fechaCalificacionProveedor;
	
	@Column(name = "calificacion_recolector")
	private int calificacionRecuperador;
	
	@Column(name = "fecha_calificacion_recolector")
	private Date fechaCalificacionRecuperador;
	
	@Column(name = "observacion_solicitud")
	private String observacionProveedor;
	
	@Column(name = "observacion_recoleccion")
	private String observacionRecuperador;
	
	@ManyToOne
	@JoinColumn(name = "solicitud_id")
	private Solicitud solicitud;

	public Calificacion() {
		
	}

	public Calificacion(int id, int calificacionProveedor, Date fechaCalificacionProveedor, int calificacionRecuperador,
			Date fechaCalificacionRecuperador, String observacionProveedor, String observacionRecuperador,
			Solicitud solicitud) {
		super();
		this.id = id;
		this.calificacionProveedor = calificacionProveedor;
		this.fechaCalificacionProveedor = fechaCalificacionProveedor;
		this.calificacionRecuperador = calificacionRecuperador;
		this.fechaCalificacionRecuperador = fechaCalificacionRecuperador;
		this.observacionProveedor = observacionProveedor;
		this.observacionRecuperador = observacionRecuperador;
		this.solicitud = solicitud;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCalificacionProveedor() {
		return calificacionProveedor;
	}

	public void setCalificacionProveedor(int calificacionProveedor) {
		this.calificacionProveedor = calificacionProveedor;
	}

	public Date getFechaCalificacionProveedor() {
		return fechaCalificacionProveedor;
	}

	public void setFechaCalificacionProveedor(Date fechaCalificacionProveedor) {
		this.fechaCalificacionProveedor = fechaCalificacionProveedor;
	}

	public int getCalificacionRecuperador() {
		return calificacionRecuperador;
	}

	public void setCalificacionRecuperador(int calificacionRecuperador) {
		this.calificacionRecuperador = calificacionRecuperador;
	}

	public Date getFechaCalificacionRecuperador() {
		return fechaCalificacionRecuperador;
	}

	public void setFechaCalificacionRecuperador(Date fechaCalificacionRecuperador) {
		this.fechaCalificacionRecuperador = fechaCalificacionRecuperador;
	}

	public String getObservacionProveedor() {
		return observacionProveedor;
	}

	public void setObservacionProveedor(String observacionProveedor) {
		this.observacionProveedor = observacionProveedor;
	}

	public String getObservacionRecuperador() {
		return observacionRecuperador;
	}

	public void setObservacionRecuperador(String observacionRecuperador) {
		this.observacionRecuperador = observacionRecuperador;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	@Override
	public String toString() {
		return "Calificacion [id=" + id + ", calificacionProveedor=" + calificacionProveedor
				+ ", fechaCalificacionProveedor=" + fechaCalificacionProveedor + ", calificacionRecuperador="
				+ calificacionRecuperador + ", fechaCalificacionRecuperador=" + fechaCalificacionRecuperador
				+ ", observacionProveedor=" + observacionProveedor + ", observacionRecuperador="
				+ observacionRecuperador + ", solicitud=" + solicitud + "]";
	}
	
}
