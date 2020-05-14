package com.gestionHotel.servicios;


import org.springframework.stereotype.Service;
import com.gestionHotel.modelo.LineaReserva;
import com.gestionHotel.repositorios.*;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class LineaReservaServicio extends BaseService<LineaReserva,Long,LineaReservaRepository>{

	public LineaReservaServicio(LineaReservaRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}


	
	

}
