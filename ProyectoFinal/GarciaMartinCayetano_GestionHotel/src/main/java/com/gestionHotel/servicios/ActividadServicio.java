package com.gestionHotel.servicios;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.repositorios.ActividadRepository;
import com.gestionHotel.servicios.base.BaseService;

public class ActividadServicio extends BaseService<Actividad, Long, ActividadRepository>{

	public ActividadServicio(ActividadRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
