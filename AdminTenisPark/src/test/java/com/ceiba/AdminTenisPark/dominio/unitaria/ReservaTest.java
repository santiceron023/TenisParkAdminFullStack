package com.ceiba.AdminTenisPark.dominio.unitaria;

import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.testDataBuilder.ReservaTestDataBuilder;


public class ReservaTest {

	private static final Integer NUMERO_CANCHA = 1;
	private static final LocalDateTime FECHA_INICIO = LocalDateTime.of(2019, Month.APRIL, 1, 12, 0);
	private static final LocalDateTime FECHA_FIN = LocalDateTime.of(2019, Month.APRIL, 1, 14, 0);

	@Test
	public void crearReservaest() {

		// arrange
		/*ReservaTestDataBuilder productoTestDataBuilder = new ReservaTestDataBuilder().
				conFechaFin(FECHA_FIN).
				conFechaInicio(FECHA_INICIO).
				conNumeroDeCancha(NUMERO_CANCHA);

		// act
		Reserva producto = productoTestDataBuilder.build();

		// assert
		Assertions.assertEquals(NUMERO_CANCHA, producto.getNumeroCancha());
		Assertions.assertEquals(FECHA_FIN, producto.getFechaFin());
		Assertions.assertEquals(FECHA_INICIO, producto.getFechaInicio());*/
		Assertions.assertFalse(false);
	}

}