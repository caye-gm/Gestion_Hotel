package com.gestionHotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
	
		//index app admin

		@GetMapping("/")
		public String Inicio() {
			return "/admin/index";
		}
		//-----------
	

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
		//---------------------------------------------------
		
		//editarAdminUser
		 @GetMapping("/editar-usuario/{id}")
			public String AdminEditarUsuario(Model m,@PathVariable("id") long id) {
				m.addAttribute("usuario", servicio.findById(id));
				return "/admin/usuarioEditarAdmin";
			}
		
		 
		 //editar mi propio perfil
		    @GetMapping("/editar-usuario")
			public String UsuarioEditar(Model m,@AuthenticationPrincipal Usuario u) {
				m.addAttribute("usuario", servicio.findById(u.getId()));
				return "/admin/usuarioEditarAdmin";
			}
		    
		    
			@PostMapping("/editar-usuario/submit")
			public String UsuarioEditarsubmit(@ModelAttribute("usuario") Usuario u) {
			
				servicio.cambiarPass(u);
				servicio.edit(u);
				
				return "redirect:/admin/editar-usuario";
			}
		    

	
}
