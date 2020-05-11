package com.gestionHotel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gestionHotel.modelo.Actividad;
import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.UsuarioServicio;

@SpringBootApplication
public class GarciaMartinCayetanoGestionHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarciaMartinCayetanoGestionHotelApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UsuarioServicio ActividadServicio) {
		return args -> {
				
		};
	}
	
	
	
	
	
}
