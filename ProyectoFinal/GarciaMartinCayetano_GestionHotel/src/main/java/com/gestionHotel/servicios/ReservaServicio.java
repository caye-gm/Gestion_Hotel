package com.gestionHotel.servicios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.gestionHotel.modelo.Reserva;
import com.gestionHotel.repositorios.ReservaRepository;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class ReservaServicio extends BaseService<Reserva, Long, ReservaRepository>{

	public ReservaServicio(ReservaRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	public List<Reserva> reservasUsuarios(long id) {
		return repositorio.reservasUsuario(id);
		
	}
	
}
