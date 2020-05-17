package com.gestionHotel.servicios;

import org.springframework.stereotype.Service;

import com.gestionHotel.modelo.Familiar;
import com.gestionHotel.repositorios.FamiliarRepository;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class FamiliarServicio extends BaseService<Familiar,Long,FamiliarRepository>{

	public FamiliarServicio(FamiliarRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
