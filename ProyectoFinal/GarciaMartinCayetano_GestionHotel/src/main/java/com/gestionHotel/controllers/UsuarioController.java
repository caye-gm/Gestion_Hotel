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
public class UsuarioController {
		@Autowired
		UsuarioServicio servicio;
	
	

		
	@PostMapping("/registro")
		public String registro(@ModelAttribute("usuario") Usuario u) {
		servicio.registrar(u);
		return "redirect:/";
	}
	
}
