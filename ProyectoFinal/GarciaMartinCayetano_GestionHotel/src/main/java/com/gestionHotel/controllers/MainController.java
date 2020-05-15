package com.gestionHotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gestionHotel.modelo.Usuario;


@Controller
public class MainController {

	/*
	 * Estos controller son de usuarios sin permisos
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
	@GetMapping("/registro")
	public String registro(Model u) {
		u.addAttribute("usuario", new Usuario());
		return "registro";
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
