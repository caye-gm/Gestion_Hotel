package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestionHotel.modelo.Reserva;
import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.ReservaServicio;
import com.gestionHotel.servicios.UsuarioServicio;

@Controller
public class ReservaController {

	@Autowired
	ReservaServicio reservaS;
	@Autowired
	UsuarioServicio usuarioS;
	
	/* Consulta para obtener la lista de reservas de mi usuario
	@GetMapping("/reserva/list")
	public String gestionreservas(@AuthenticationPrincipal Usuario usu,Model u) {
		u.addAttribute("listaReserva", reservaS.findAll());
		return "reservaLista";
	}
	*/
	@GetMapping("/reserva/list")
	public String reservaLista(Model u) {
			u.addAttribute("listaReservas", reservaS.findAll());
			
		return "reservaLista";
	}
	@GetMapping("/reserva/borrar/{id}")
	public String borrar(@PathVariable("id") long id) {
		reservaS.deleteById(id);
		return "redirect:/reserva/list";
	}
	
	//many to one reserva usuario
	
	
	
	@GetMapping("/reserva")
	public String reserva(Model model) {
		
		model.addAttribute("addReserva", new Reserva());
		return "reserva";
	}
	
	@PostMapping("/reserva/submit")
	public String reservaForm(@ModelAttribute("addReserva") Reserva r,@AuthenticationPrincipal Usuario usu ) {		
		r.setUsuario(usu);
		reservaS.save(r);
		return "redirect:/reserva";
	}
	
	
	
	
	
	
}
