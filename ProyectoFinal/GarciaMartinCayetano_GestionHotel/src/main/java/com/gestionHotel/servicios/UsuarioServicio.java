package com.gestionHotel.servicios;

import org.springframework.stereotype.Service;
import com.gestionHotel.modelo.*;
import com.gestionHotel.repositorios.*;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepository>{

	public UsuarioServicio(UsuarioRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	
}