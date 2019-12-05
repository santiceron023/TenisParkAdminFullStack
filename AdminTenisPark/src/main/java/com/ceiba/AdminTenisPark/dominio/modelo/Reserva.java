package com.ceiba.AdminTenisPark.dominio.modelo;

import java.time.LocalDateTime;

public class Reserva {

	private Integer id;
	private Integer tarifa;
	private Integer usuario;
	private Integer cancha;
	private LocalDateTime fechaInicio;		
	private LocalDateTime fechaFin;	
	private Integer numeroUsuarios;
	
	
	public Reserva() {
	}
	public Reserva(Integer id, Integer tarifa, Integer usuario, Integer cancha, LocalDateTime fechaInicio,
			LocalDateTime fechaFin, Integer numeroUsuarios) {
		super();
		this.id = id;
		this.tarifa = tarifa;
		this.usuario = usuario;
		this.cancha = cancha;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.numeroUsuarios = numeroUsuarios;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTarifa() {
		return tarifa;
	}
	public void setTarifa(Integer tarifa) {
		this.tarifa = tarifa;
	}
	public Integer getUsuario() {
		return usuario;
	}
	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
	public Integer getCancha() {
		return cancha;
	}
	public void setCancha(Integer cancha) {
		this.cancha = cancha;
	}
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Integer getNumeroUsuarios() {
		return numeroUsuarios;
	}
	public void setNumeroUsuarios(Integer numeroUsuarios) {
		this.numeroUsuarios = numeroUsuarios;
	}
	
	

}
