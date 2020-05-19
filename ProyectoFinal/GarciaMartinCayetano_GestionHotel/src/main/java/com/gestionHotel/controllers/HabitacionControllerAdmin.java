package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionHotel.modelo.Doble;
import com.gestionHotel.modelo.Familiar;
import com.gestionHotel.modelo.Habitacion;
import com.gestionHotel.modelo.Individual;
import com.gestionHotel.servicios.HabitacionServicio;

@Controller
@RequestMapping("/admin")
public class HabitacionControllerAdmin {

	//gestion habitaciones
	
		@Autowired
		HabitacionServicio servicioHab;
		
		
		
		@GetMapping("/gestion-habitaciones/list")
		public String gestionhabitaciones() {
		
			return "/admin/gHabitacionesLista";
		}
		
		@GetMapping("/gestion-habitaciones")
		public String gestionhabitaciones(Model u) {
		
			return "/admin/gHabitaciones";
		}
		
		
		@PostMapping("/gHabitaciones/submit")
		public String anyadira(@ModelAttribute("addHabitacion") Habitacion u) { 
			if(u instanceof Individual) {
				servicioHab.save(u);
			}else if(u instanceof Doble) {
				servicioHab.save(u);
			}else if(u instanceof Familiar) {
				servicioHab.save(u);
			}
		return "redirect:/admin/gestion-Habitaciones";
		}
	
	
	
}
