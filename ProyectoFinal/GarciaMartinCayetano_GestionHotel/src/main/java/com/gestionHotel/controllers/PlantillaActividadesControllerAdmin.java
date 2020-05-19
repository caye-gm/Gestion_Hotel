package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		
		
		@GetMapping("/gestion-actividades-plantilla/list")
		public String gActP() {

			return "/admin/gActividadesPlantillaLista";
		}
		@GetMapping("/gestion-actividades-plantilla")
		public String gActP(Model u) {
			u.addAttribute("addPlantillaActividades", new PlantillaActividades());
			
			return "/admin/gActividadesPlantilla";
		}
		@PostMapping("/gestion-actividades-plantilla/submit")
		
		public String gActP(@ModelAttribute("addPlantillaActividades") PlantillaActividades u) {
			servicioPA.save(u);
		return "redirect:/admin/gestion-actividades-plantilla";
		}
		
		
		
		
		
		/*
		@GetMapping("/gestion-actividades-plantilla")
		public String RgActP(Model u) {
			u.addAttribute("RemovePlantillaActividades", new PlantillaActividades());
			
			return "/admin/gActividadesPlantilla";
		}*/
	
}
