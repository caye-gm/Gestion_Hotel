package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gestionHotel.servicios.ReservaServicio;

@Controller
@RequestMapping("/admin")
public class ReservaControllerAdmin {

	@Autowired
	ReservaServicio servicioR;
	
	//gestion reserva

	
	@GetMapping("/gestion-reservas/list")
	public String gestionreservas(Model m) {
		m.addAttribute("listaReservas", servicioR.findAll());
		return "/admin/gReservasLista";
	}

	//borrar
	@GetMapping("/gestion-reservas/borrar/{id}")
	public String borrar(@PathVariable("id") long id) {
		servicioR.deleteById(id);
		return "redirect:/admin/gestion-reservas/list";
		}
	
	
}
