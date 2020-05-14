package com.gestionHotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

	
	@GetMapping("/")
	public String Inicio() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/registro")
	public String registro() {
		return "register";
	}
	@GetMapping("/contacto")
	public String contacto() {
		return "QuienSomos";
	}
	@GetMapping("/reserva")
	public String reserva() {
		return "reserva";
	}
	@GetMapping("/gestion-habitaciones")
	public String gestionhabitaciones() {
		return "gHabitaciones";
	}
	@GetMapping("/gestion-reservas")
	public String gestionreservas() {
		return "gReservas";
	}
	@GetMapping("/gestion-usuarios")
	public String gestionusuarios() {
		return "gUsuario";
	}
	@GetMapping("/gestion-actividades")
	public String gestionactividades() {
		return "gActividades";
	}
	
	
	
}
