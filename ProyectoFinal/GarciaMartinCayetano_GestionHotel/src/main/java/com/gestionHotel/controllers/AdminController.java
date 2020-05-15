package com.gestionHotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	
	@GetMapping("/gestion-habitaciones")
	public String gestionhabitaciones() {
		return "/admin/gHabitaciones";
	}
	@GetMapping("/gestion-reservas")
	public String gestionreservas() {
		return "/admin/gReservas";
	}
	@GetMapping("/gestion-usuarios")
	public String gestionusuarios() {
		return "/admin/gUsuario";
	}
	@GetMapping("/gestion-actividades")
	public String gestionactividades() {
		return "/admin/gActividades";
	}
	

}

