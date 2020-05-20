package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.servicios.ActividadServicio;
import com.gestionHotel.servicios.PlantillaActividadesServicio;
@Controller
@RequestMapping("/admin")
public class ActividadControllerAdmin {

	//actividades
	
		@Autowired
		ActividadServicio servicioA;
		@Autowired
		PlantillaActividadesServicio servicioPA;
		//lista
		@GetMapping("/gestion-actividades/list")
		public String gestionactividadLista(Model u) {
			u.addAttribute("listaActividad", servicioA.findAll());
			return "/admin/gActividadesLista";
		}
		
		//borrar
		@GetMapping("/gestion-actividades/borrar/{id}")
		public String borrar(@PathVariable("id") long id) {
			servicioA.deleteById(id);
			return "redirect:/admin/gestion-actividades/list";
		}
		
		
		
		//---
		@GetMapping("/gestion-actividades")
		public String gestionactividad(Model u) {
			u.addAttribute("plantillaAct", servicioPA.findAll());
			u.addAttribute("addActividad", new Actividad());	
			return "/admin/gActividades";
		}
		@PostMapping("/gestion-actividades/submit")
		public String addActividad(@ModelAttribute("Actividad") Actividad u,Model model) { 
		servicioA.save(u);
		model.addAttribute("plantillaAct",servicioPA.findAll());
		return "redirect:/admin/gestion-actividades";
		}
	
	
	
	
}
