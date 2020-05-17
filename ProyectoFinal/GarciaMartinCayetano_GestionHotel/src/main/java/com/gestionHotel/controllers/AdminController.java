package com.gestionHotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.modelo.PlantillaActividades;
import com.gestionHotel.modelo.Usuario;

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
	public String gestionactividad(Model u) {
		u.addAttribute("Actividad", new Actividad());	
		return "/admin/gActividades";
	}
	
	@GetMapping("/gestion-actividades-plantilla")
	public String gActP(Model u) {
		u.addAttribute("PlantillaActividades", new PlantillaActividades());
		
		return "/admin/gActividadesPlantilla";
	}

}

