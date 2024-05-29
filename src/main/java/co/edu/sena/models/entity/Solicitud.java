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
@Table(name = "solicitud")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name = "barrio_id")
	private Barrio barrio;
	
	@ManyToOne
	@JoinColumn(name = "persona_solicita_id")
	private Persona solicitante;
/*	
	@ManyToOne
	@JoinColumn(name = "persona_recolecta_id")
	private Persona recuperador;
	
	@ManyToOne
	@JoinColumn(name = "persona_almacenista_id")
	private Persona almacenista;
	*/	
	public Solicitud() {
		
	}

	public Solicitud(int id, String direccion, String telefono, Barrio barrio, Persona solicitante, Persona recuperador,
			Persona almacenista) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.telefono = telefono;
		this.barrio = barrio;
		this.solicitante = solicitante;
		//this.recuperador = recuperador;
		//this.almacenista = almacenista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Barrio getBarrio() {
		return barrio;
	}

	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}

	public Persona getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Persona solicitante) {
		this.solicitante = solicitante;
	}

//	public Persona getRecuperador() {
//		return recuperador;
//	}
//
//	public void setRecuperador(Persona recuperador) {
//		this.recuperador = recuperador;
//	}
//
//	public Persona getAlmacenista() {
//		return almacenista;
//	}
//
//	public void setAlmacenista(Persona almacenista) {
//		this.almacenista = almacenista;
//	}

//	@Override
//	public String toString() {
//		return "Solicitud [id=" + id + ", direccion=" + direccion + ", telefono=" + telefono + ", barrio=" + barrio
//				+ ", solicitante=" + solicitante + ", recuperador=" + recuperador + ", almacenista=" + almacenista
//				+ "]";
//	}
	
}
