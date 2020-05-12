package com.gestionHotel.servicios;

import org.springframework.stereotype.Service;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.repositorios.ActividadRepository;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class ActividadServicio extends BaseService<Actividad, Long, ActividadRepository>{

	public ActividadServicio(ActividadRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
