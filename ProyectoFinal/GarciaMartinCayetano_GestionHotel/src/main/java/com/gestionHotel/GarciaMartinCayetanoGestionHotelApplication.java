package com.gestionHotel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.UsuarioServicio;


@SpringBootApplication
public class GarciaMartinCayetanoGestionHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarciaMartinCayetanoGestionHotelApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UsuarioServicio servicio,PasswordEncoder passwordEncoder) {
		return args -> {
			
			Usuario u = new Usuario();
			u.setAdmin(false);
			u.setUsername("usuario");
			u.setEmail("luismi.lopez@email.com");
			u.setPassword(passwordEncoder.encode("1234"));
			
			
			
			servicio.save(u);
			
			
			Usuario a = new Usuario();
			a.setAdmin(true);
			a.setUsername("admin");
			a.setEmail("cayetano@email.com");
			a.setPassword(passwordEncoder.encode("admin"));
			
			servicio.save(a);
			
			
			
			
			
		};
	}
	
	
	
	
	
}
