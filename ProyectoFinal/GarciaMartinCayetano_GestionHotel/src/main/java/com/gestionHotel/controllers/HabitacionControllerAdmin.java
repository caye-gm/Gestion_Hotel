package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		public String gestionhabitacionesList(Model u) {
			u.addAttribute("listaHabitaciones", servicioHab.findAll());
			return "/admin/gHabitacionesLista";
		}
		
		//borrar
		
				@GetMapping("/gestion-habitaciones/borrar/{id}")
				public String borrar(@PathVariable("id") long id) {
					servicioHab.deleteById(id);
					return "redirect:/admin/gestion-habitaciones/list";
				}
		
		
		//index
		@GetMapping("/gestion-habitaciones")
		public String indexgestionhabitaciones() {
			
			return "/admin/gHabitaciones";
		}
		@GetMapping("/gHabitaciones/gHabitacionesIndividual")
		public String indexgestionhabitacionesIndividual(Model m) {
			m.addAttribute("addHabitacionInd",new Individual(0));
			return "/admin/gHabitacionesIndividual";
		}
		@GetMapping("/gHabitaciones/gHabitacionesDoble")
		public String indexgestionhabitacionesDoble(Model m) {
			m.addAttribute("addHabitacionDob", new Doble(0));
			return "/admin/gHabitacionesDoble";
		}
		@GetMapping("/gHabitaciones/gHabitacionesFamiliar")
		public String indexgestionhabitacionesFamiliar(Model m) {
			m.addAttribute("addHabitacionFam", new Familiar(0));
			return "/admin/gHabitacionesFamiliar";
		}
		//tipos
		
		
		
		//creaciones
		
		
		@PostMapping("/gHabitaciones/gHabitacionesIndividual/submit")
		public String addHabdInd(@ModelAttribute("addHabitacionInd") Individual u) { 
			
			servicioHab.save(u);
		return "redirect:/admin/gestion-habitaciones";
		}
		@PostMapping("/gHabitaciones/gHabitacionesDoble/submit")
		public String addHabdDob(@ModelAttribute("addHabitacionDob") Doble u) { 
			
			servicioHab.save(u);
		return "redirect:/admin/gestion-habitaciones";
		}
		@PostMapping("/gHabitaciones/gHabitacionesFamiliar/submit")
		public String addHabdFam(@ModelAttribute("addHabitacionFam") Familiar u) { 
			
			servicioHab.save(u);
		return "redirect:/admin/gestion-habitaciones";
		}
	
	
}
