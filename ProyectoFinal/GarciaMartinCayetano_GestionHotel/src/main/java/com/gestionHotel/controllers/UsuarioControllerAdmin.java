package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.UsuarioServicio;

@Controller
@RequestMapping("/admin")
public class UsuarioControllerAdmin {
		@Autowired
		UsuarioServicio servicio;
	
	
		//gestion usuario
		@GetMapping("/gestion-usuarios/list")
		public String gestionusuarios(Model u) {
			u.addAttribute("listaUsuario", servicio.findAll());
			return "/admin/gUsuarioLista";
		}
		
		@GetMapping("/gestion-usuarios")
		public String usuario(Model u) {
			u.addAttribute("addUsuario", new Usuario());
			return "/admin/gUsuario";
		}
		
		@PostMapping("/gestion-usuarios/submit")
		public String usuario(@ModelAttribute("addUsuario") Usuario u) { 
		servicio.registrar(u);
		return "redirect:/admin/gestion-usuarios";
		}
		
		
		
		
		
		
		//index admin
		
		@GetMapping("/")
		public String Inicio() {
			return "/admin/index";
		}
		
		
		
	
	
	
	
}
