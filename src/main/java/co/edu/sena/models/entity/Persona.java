package co.edu.sena.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "correo_electronico")
	private String email;

	@Column(name = "clave")
	private String clave;

	@Column(name = "numero_documento")
	private String documento;

	@ManyToOne
	@JoinColumn(name = "rol_id")
	private Rol rol;

	@ManyToOne
	@JoinColumn(name = "documento_id")
	private Tipo_documento tipoDocumento;

	/*
	 * @OneToMany(mappedBy = "persona") private List<Capacitacion> capacitaciones;
	 */
/*
	@OneToMany(mappedBy = "solicitante")
	private List<Solicitud> solicitudes;

	@OneToMany(mappedBy = "recuperador")
	private List<Solicitud> recolecciones;

	@OneToMany(mappedBy = "almacenista")
	private List<Solicitud> entregas;
*/
	public Persona() {

	}

	public Persona(int id, String nombre, String apellido, String email, String clave, String documento, Rol rol,
			Tipo_documento tipoDocumento, List<Capacitacion> capacitaciones, List<Solicitud> solicitudes,
			List<Solicitud> recolecciones, List<Solicitud> entregas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.clave = clave;
		this.documento = documento;
		this.rol = rol;
		this.tipoDocumento = tipoDocumento;
		// this.capacitaciones = capacitaciones;
//		this.solicitudes = solicitudes;
//		this.recolecciones = recolecciones;
//		this.entregas = entregas;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Tipo_documento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Tipo_documento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/*
	 * public List<Capacitacion> getCapacitaciones() { return capacitaciones; }
	 * 
	 * public void setCapacitaciones(List<Capacitacion> capacitaciones) {
	 * this.capacitaciones = capacitaciones; }
	 

	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public List<Solicitud> getRecolecciones() {
		return recolecciones;
	}

	public void setRecolecciones(List<Solicitud> recolecciones) {
		this.recolecciones = recolecciones;
	}

	public List<Solicitud> getEntregas() {
		return entregas;
	}

	public void setEntregas(List<Solicitud> entregas) {
		this.entregas = entregas;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", clave="
				+ clave + ", documento=" + documento + ", rol=" + rol + ", tipoDocumento=" + tipoDocumento
				+ ", solicitudes=" + solicitudes + ", recolecciones=" + recolecciones + ", entregas=" + entregas + "]";
	}
*/
}
