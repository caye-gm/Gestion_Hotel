package com.gestionHotel.servicios;


import org.springframework.stereotype.Service;
import com.gestionHotel.modelo.Habitacion;
import com.gestionHotel.repositorios.HabitacionRepository;
import com.gestionHotel.servicios.base.BaseService;


@Service

public class HabitacionServicio extends BaseService<Habitacion, Long, HabitacionRepository>{

	public HabitacionServicio(HabitacionRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}


}
