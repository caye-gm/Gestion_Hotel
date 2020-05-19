package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.ActividadServicio;
import com.gestionHotel.servicios.UsuarioServicio;

@Controller
public class ActividadController {

	@Autowired
	ActividadServicio servicioAct;
	@Autowired
	UsuarioServicio servicioUsu;
	
	
	@GetMapping("/actividades")
	public String actividades() {
	
		return "/actividad";
	}
	
	/*
	@GetMapping("/actividades")
	public String actividades(@AuthenticationPrincipal Usuario usu,Actividad a) {
		a.getUsuarios().add(usu);
		
		
		return "/actividad";
	}*/
}
