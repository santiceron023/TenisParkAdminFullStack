package com.ceiba.AdminTenisPark.infraestructura.repositorio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cancha")
public class Cancha {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "Administrador", nullable = false, length = 100)
	private String administrador;
	
	@Column(name = "Telefono", nullable = false, length = 20)
	private String telefono;

	public Cancha(Integer id, String administrador, String telefono) {
		super();
		this.id = id;
		this.administrador = administrador;
		this.telefono = telefono;
	}

	public Cancha() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
