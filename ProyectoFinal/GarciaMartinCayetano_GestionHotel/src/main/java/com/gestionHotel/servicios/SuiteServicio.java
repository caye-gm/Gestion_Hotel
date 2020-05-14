package com.gestionHotel.servicios;

import org.springframework.stereotype.Service;

import com.gestionHotel.modelo.Suite;
import com.gestionHotel.repositorios.SuiteRepository;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class SuiteServicio extends BaseService<Suite,Long,SuiteRepository>{

	public SuiteServicio(SuiteRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
