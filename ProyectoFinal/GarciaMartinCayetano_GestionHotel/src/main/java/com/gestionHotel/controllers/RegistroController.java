package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.UsuarioServicio;
@Controller
public class RegistroController {

	@Autowired
	UsuarioServicio servicio;
	
	@GetMapping("/registro")
	public String registro(Model u) {
	u.addAttribute("usuario", new Usuario());
	return "registro";
	}
	
	
	@PostMapping("/registro")
	public String registro(@ModelAttribute("usuario") Usuario u) {
	servicio.registrar(u);
	return "redirect:/login";
}
}
