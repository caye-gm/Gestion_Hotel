package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.ReservaServicio;

@Controller
public class ReservaController {

	@Autowired
	ReservaServicio reservaS;
	
	/* Consulta para obtener la lista de reservas de mi usuario
	@GetMapping("/reserva/list")
	public String gestionreservas(@AuthenticationPrincipal Usuario usu,Model u) {
		u.addAttribute("listaReserva", reservaS.findAll());
		return "reservaLista";
	}
	*/
	@GetMapping("/reserva-lista")
	public String reserva() {
		return "reservaLista";
	}
	
}
