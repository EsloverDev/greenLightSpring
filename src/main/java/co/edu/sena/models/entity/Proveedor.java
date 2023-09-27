package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proveedor_id")
	private int id;
	
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToOne
	private Perfil per;

	public Proveedor() {
		
	}

	public Proveedor(int id, String direccion, Perfil per) {
		
		this.id = id;
		this.direccion = direccion;
		this.per = per;
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

	public Perfil getPer() {
		return per;
	}

	public void setPer(Perfil per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", direccion=" + direccion + ", per=" + per + "]";
	}
	
}
