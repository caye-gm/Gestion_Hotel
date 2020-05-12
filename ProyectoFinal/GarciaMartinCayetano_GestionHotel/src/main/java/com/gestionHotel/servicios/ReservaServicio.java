package com.gestionHotel.servicios;

import com.gestionHotel.modelo.Reserva;
import com.gestionHotel.repositorios.ReservaRepository;
import com.gestionHotel.servicios.base.BaseService;

public class ReservaServicio extends BaseService<Reserva, Long, ReservaRepository>{

	public ReservaServicio(ReservaRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
