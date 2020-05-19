package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.servicios.ActividadServicio;
@Controller
@RequestMapping("/admin")
public class ActividadControllerAdmin {

	//actividades
	
		@Autowired
		ActividadServicio servicioA;
		
		
		@GetMapping("/gestion-actividades/list")
		public String gestionactividad() {			
			return "/admin/gActividadesLista";
		}
		
		@GetMapping("/gestion-actividades")
		public String gestionactividad(Model u) {
			u.addAttribute("addActividad", new Actividad());	
			return "/admin/gActividades";
		}
		@PostMapping("/gestion-actividades/submit")
		public String addActividad(@ModelAttribute("Actividad") Actividad u) { 
		servicioA.save(u);
		return "redirect:/admin/gestion-actividades";
		}
	
	
	
	
}
