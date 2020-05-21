package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.UsuarioServicio;


@Controller
@RequestMapping("/admin")
public class UsuarioControllerAdmin {
		@Autowired
		UsuarioServicio servicio;
	
	

		@GetMapping("/gestion-usuarios")
		public String usuario(Model u) {
			u.addAttribute("listaUsuario", servicio.findAll());
			u.addAttribute("addUsuario", new Usuario());
			return "/admin/gUsuario";
		}
		
		@PostMapping("/gestion-usuarios/submit")
		public String usuario(@ModelAttribute("addUsuario") Usuario u) { 
		servicio.registrar(u);
		return "redirect:/admin/gestion-usuarios";
		}
		
		
		//borrar
		@GetMapping("/gestion-usuarios/borrar/{id}")
		public String borrar(@PathVariable("id") long id) {
			servicio.deleteById(id);
			return "redirect:/admin/gestion-usuarios";
		}
		
		
		//editar
		/*
		@GetMapping("/editar/{id}")
		public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		
			//Buscamos el alumno por id (el recogido al pinchar en el enlace editar del alumno
			//concreto que queremos editar
			Usuario aEditar = servicio.findById(id);
			//Añadimos al modelo la lista de todos los cursos
			model.addAttribute("cursos", cursoServicio.findAll());
			//Si el alumno buscado no es nulo lo pasamos al modelo y mostramos el fomrulario
			//con los campos relleno (estamos editando)
			if (aEditar != null) {
				model.addAttribute("alumno", aEditar);
				return "formulario";
			} else {
				// No existe ningún alumno con el Id proporcionado.
				// Redirigimos hacia el listado de todos los alumnos
				return "redirect:/";
			}
			
			
		}
		
		
		@PostMapping("/editar/submit")
		public String procesarFormularioEdicion(@ModelAttribute("alumno") Alumno a) {
			alumnoServicio.edit(a);
			return "redirect:/";
		}
		
		*/
		
		
		//index admin
		
		@GetMapping("/")
		public String Inicio() {
			return "/admin/index";
		}
		
		
		
	
	
	
	
}
