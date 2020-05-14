package com.gestionHotel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.repositorios.UsuarioRepository;
import com.gestionHotel.servicios.UsuarioServicio;
import com.gestionHotel.servicios.base.BaseService;

@SpringBootApplication
public class GarciaMartinCayetanoGestionHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarciaMartinCayetanoGestionHotelApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UsuarioServicio servicio) {
		return args -> {
			
			Usuario u = new Usuario();
			u.setAdmin(false);
			u.setUsername("Luis Miguel");
			u.setEmail("luismi.lopez@email.com");
			u.setPassword("1234");
			
			
			
			servicio.save(u);
			
			
			Usuario a = new Usuario();
			a.setAdmin(true);
			a.setUsername("Angel");
			a.setEmail("angel.naranjo@email.com");
			a.setPassword("1234");
			
			servicio.save(a);
			
			
			
			
			
		};
	}
	
	
	
	
	
}
