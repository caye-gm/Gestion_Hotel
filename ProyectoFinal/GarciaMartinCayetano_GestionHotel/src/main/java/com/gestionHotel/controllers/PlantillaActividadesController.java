package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.modelo.PlantillaActividades;
import com.gestionHotel.servicios.ActividadServicio;
import com.gestionHotel.servicios.PlantillaActividadesServicio;

@Controller
public class PlantillaActividadesController {

	@Autowired
	PlantillaActividadesServicio servicioPA;
	@Autowired
	ActividadServicio servicioA;
	
	
	@PostMapping("/admin/gestion-actividades")
	public String anyadira(@ModelAttribute("Actividades") Actividad u) {
	servicioA.save(u);
	return "redirect:/admin/gestion-actividades";
	}
	
	@PostMapping("/admin/gestion-actividades-plantilla")
	public String gActP(@ModelAttribute("PlantillaActividades") PlantillaActividades u) {
	servicioPA.save(u);
	return "redirect:/admin/gestion-actividades-plantilla";
	}
	
}
