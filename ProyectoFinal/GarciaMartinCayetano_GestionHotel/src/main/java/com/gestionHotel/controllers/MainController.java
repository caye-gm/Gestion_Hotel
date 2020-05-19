package com.gestionHotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class MainController {

	/*
	 * Estos controller son de usuarios sin permisos y usuarios logueados
	 * 
	 */
	
	
	@GetMapping("/")
	public String Inicio() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	

	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
	

	@GetMapping("/reserva")
	public String reserva() {
		return "reserva";
	}
	
	
	
}
