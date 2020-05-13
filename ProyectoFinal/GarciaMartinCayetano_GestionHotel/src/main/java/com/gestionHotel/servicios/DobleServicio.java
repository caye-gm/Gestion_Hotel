package com.gestionHotel.servicios;

import org.springframework.stereotype.Service;

import com.gestionHotel.modelo.Doble;
import com.gestionHotel.repositorios.DobleRepository;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class DobleServicio extends BaseService<Doble,Long,DobleRepository>{

	public DobleServicio(DobleRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
