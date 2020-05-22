package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gestionHotel.modelo.PlantillaActividades;
import com.gestionHotel.servicios.PlantillaActividadesServicio;

@Controller
@RequestMapping("/admin")
public class PlantillaActividadesControllerAdmin {

	//plantilla actividades
		@Autowired
		PlantillaActividadesServicio servicioPA;
		
	
	
		//borrar
		@GetMapping("/gestion-actividades-plantilla/borrar/{id}")
		public String borrar(@PathVariable("id") long id) {
			servicioPA.deleteById(id);
			return "redirect:/admin/gestion-actividades-plantilla";
		}
		
		
		
		
		
		@GetMapping("/gestion-actividades-plantilla")
		public String gActP(Model u) {
			u.addAttribute("addPlantillaActividades", new PlantillaActividades());
			u.addAttribute("listaActividadPlantilla",servicioPA.findAll());
			return "/admin/gActividadesPlantilla";
		}
		@PostMapping("/gestion-actividades-plantilla/submit")
		
		public String gActP(@ModelAttribute("addPlantillaActividades") PlantillaActividades u) {
			servicioPA.save(u);
		return "redirect:/admin/gestion-actividades-plantilla";
		}
		
		
		
		
	
}
