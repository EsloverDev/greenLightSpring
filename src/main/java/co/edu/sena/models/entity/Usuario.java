package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@Column(name = "cod_usu")
	private int codigo;
	
	@Column(name = "nom_usu")
	private String nombre;
	
	@Column(name = "ape_usu")
	private String apellido;
	
	@Column(name = "edad_usu")
	private int edad;
	
	@Column(name = "cont_usu")
	private String contrasena;
	
	public Usuario() {
		
	}

	public Usuario(int codigo, String nombre, String apellido, int edad, String contrasena) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.contrasena = contrasena;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", contrasena=" + contrasena + "]";
	}
	
	
}
