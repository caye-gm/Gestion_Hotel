package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gestionHotel.modelo.Reserva;
import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.ReservaServicio;

@Controller
@RequestMapping("/admin")
public class ReservaControllerAdmin {

	@Autowired
	ReservaServicio servicioR;
	
	//gestion reserva

	
	@GetMapping("/gestion-reservas/list")
	public String gestionreservas() {
		
		return "/admin/gReservasLista";
	}
		@GetMapping("/gestion-reservas")
		public String gestionreservas(@AuthenticationPrincipal Usuario usu,Model u) {
			u.addAttribute("addReserva", new Reserva());
			return "/admin/gReservas";
		}
		
		@PostMapping("/gestion-reservas/submit")
		public String addActividad(@ModelAttribute("addReserva") Reserva u) { 
		servicioR.save(u);
		return "redirect:/admin/gestion-reservas";
		}
	
	
	
	
}
