package com.ceiba.AdminTenisPark.infraestructura.repositorio.adapter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.AdminTenisPark.infraestructura.repositorio.entity.ReservaEntity;
import com.ceiba.AdminTenisPark.infraestructura.repositorioJpa.RepositorioReservaJpa;


@Repository
public class RepositorioReservaPosgress implements RepositorioReserva {
	
	private ModelMapper modelMapper = new ModelMapper();
	private RepositorioReservaJpa repositorioReservaJpa;

	//inyeccion de dep
	public RepositorioReservaPosgress(RepositorioReservaJpa repositorioReservaJpa) {
		this.repositorioReservaJpa = repositorioReservaJpa;
	}

	@Override
	public void crear(Reserva reserva) {
		  ReservaEntity reservaEntity = modelMapper.map(reserva, ReservaEntity.class);
		  repositorioReservaJpa.save(reservaEntity);				
	}

}
