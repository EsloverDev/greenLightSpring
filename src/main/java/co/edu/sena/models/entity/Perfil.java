package co.edu.sena.models.entity;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfiles")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "perfil_id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "localidad")
	private String localidad;
	
	@Column(name = "documento")
	private String documento;
	
	@OneToMany(mappedBy = "per")
	private List<Proveedor> listaProveedores;
	
	@OneToMany(mappedBy = "per")
	private List<Recolector> listaRecolectores;
	
	public Perfil() {
		
	}

	public Perfil(int id, String nombre, String password, String email, String telefono, String pais, String ciudad,
			String localidad, String documento, LinkedList<Proveedor> listaProveedores,
			LinkedList<Recolector> listaRecolectores) {
		
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
		this.pais = pais;
		this.ciudad = ciudad;
		this.localidad = localidad;
		this.documento = documento;
		this.listaProveedores = listaProveedores;
		this.listaRecolectores = listaRecolectores;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<Proveedor> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(LinkedList<Proveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	public List<Recolector> getListaRecolectores() {
		return listaRecolectores;
	}

	public void setListaRecolectores(LinkedList<Recolector> listaRecolectores) {
		this.listaRecolectores = listaRecolectores;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", nombre=" + nombre + ", password=" + password + ", email=" + email + ", telefono="
				+ telefono + ", pais=" + pais + ", ciudad=" + ciudad + ", localidad=" + localidad + ", documento="
				+ documento + ", listaProveedores=" + listaProveedores + ", listaRecolectores=" + listaRecolectores
				+ "]";
	}

}
