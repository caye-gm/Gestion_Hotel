package com.gestionHotel.servicios;

import org.springframework.stereotype.Service;

import com.gestionHotel.modelo.Individual;
import com.gestionHotel.repositorios.IndividualRepository;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class IndividualServicio extends BaseService<Individual,Long, IndividualRepository> {

	public IndividualServicio(IndividualRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
