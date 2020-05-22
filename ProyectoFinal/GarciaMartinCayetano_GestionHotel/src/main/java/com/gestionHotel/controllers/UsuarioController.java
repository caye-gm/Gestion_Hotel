package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.ActividadServicio;
import com.gestionHotel.servicios.UsuarioServicio;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioServicio servicioU;
	@Autowired
	ActividadServicio servicioA;
	
	
	
	
	@GetMapping("/actividad-usuario")
	public String UsuarioActividad(Model m,@AuthenticationPrincipal Usuario u) {
		m.addAttribute("listaActividad", servicioA.findAll());
		m.addAttribute("melistaActividad", u.getActividades());
		return "actividad";
	}
	
	@GetMapping("/actividad-usuario/submit/add/{id}")
	public String addUsuarioActividad(@PathVariable("id") long id,Model model,@AuthenticationPrincipal Usuario u) {
		model.addAttribute("listaActividad",servicioA.findAll());
		boolean bol=false;
		for (int i = 0; i < u.getActividades().size(); i++) {
			if (u.getActividades().get(i).equals(servicioA.findById(id))) {
				bol=true;
			}
		}
		if (!bol) {
			u.addActividad(servicioA.findById(id));
			servicioU.edit(u);
		}
		
		
		return "redirect:/actividad-usuario";
	}
	@GetMapping("/actividad-usuario/submit/remove/{id}")
	public String rmUsuarioActividad(@PathVariable("id") long id,Model model,@AuthenticationPrincipal Usuario u) {
		model.addAttribute("melistaActividad",servicioA.findAll());
		System.out.println(u);
		Actividad a1=servicioA.findById(id);
	
		
				a1=u.findActivityByID(a1);
		
				u.removeActividad(servicioA.findById(id));

				servicioU.edit(u);
				servicioA.edit(a1);
				
				
		return "redirect:/actividad-usuario";
	}
	
	
	
	
	
	@GetMapping("/editar-usuario")
	public String UsuarioEditar(Model m,@AuthenticationPrincipal Usuario u) {
		m.addAttribute("usuario", servicioU.findById(u.getId()));
		return "usuarioEditar";
	}
	@PostMapping("/editar-usuario/submit")
	public String UsuarioEditarsubmit(@ModelAttribute("usuario") Usuario u) {
	
		servicioU.cambiarPass(u);
		servicioU.edit(u);
		
		return "redirect:/usuarioEditar";
	}
	
}
