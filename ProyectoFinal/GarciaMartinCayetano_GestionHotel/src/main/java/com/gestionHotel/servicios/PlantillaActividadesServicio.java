package com.gestionHotel.servicios;


import org.springframework.stereotype.Service;

import com.gestionHotel.modelo.PlantillaActividades;
import com.gestionHotel.repositorios.PlantillaActividadesRepository;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class PlantillaActividadesServicio extends BaseService<PlantillaActividades, Long, PlantillaActividadesRepository> {

	public PlantillaActividadesServicio(PlantillaActividadesRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

}
