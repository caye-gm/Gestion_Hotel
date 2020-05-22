package com.gestionHotel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gestionHotel.modelo.Doble;
import com.gestionHotel.modelo.Familiar;
import com.gestionHotel.modelo.Habitacion;
import com.gestionHotel.modelo.Individual;
import com.gestionHotel.modelo.PlantillaActividades;
import com.gestionHotel.modelo.Usuario;
import com.gestionHotel.servicios.HabitacionServicio;
import com.gestionHotel.servicios.PlantillaActividadesServicio;
import com.gestionHotel.servicios.UsuarioServicio;


@SpringBootApplication
public class GarciaMartinCayetanoGestionHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarciaMartinCayetanoGestionHotelApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(HabitacionServicio servicioH,UsuarioServicio servicio,PlantillaActividadesServicio sPA,PasswordEncoder passwordEncoder) {
		return args -> {
			
			Usuario u = new Usuario();
			u.setAdmin(false);
			u.setUsername("user");
			u.setEmail("luismi.lopez@email.com");
			u.setPassword(passwordEncoder.encode("1234"));
			
			Usuario u1 = new Usuario();
			u1.setAdmin(false);
			u1.setUsername("usuario");
			u1.setEmail("caye@email.com");
			u1.setPassword(passwordEncoder.encode("1234"));
			
			
			
			
			Usuario u2 = new Usuario();
			u2.setAdmin(true);
			u2.setUsername("admin");
			u2.setEmail("cayetano@email.com");
			u2.setPassword(passwordEncoder.encode("admin"));
			
			servicio.save(u);	
			servicio.save(u1);
			servicio.save(u2);
			
			PlantillaActividades pA1=new PlantillaActividades("Futbol","Partido de futbol",2);
			PlantillaActividades pA2=new PlantillaActividades("Tenis","Partido de tenis",1);
			
			sPA.save(pA1);
			sPA.save(pA2);
			
			
			Habitacion h1=new Individual(1,"Individual Estandar",35);
			Habitacion h2=new Individual(2,"Individual Developer",40);
			Habitacion h3=new Doble(5,"Doble Estandar",50);
			Habitacion h4=new Familiar(10,"Familiar Sweet",60);
			
			servicioH.save(h1);
			servicioH.save(h2);
			servicioH.save(h3);
			servicioH.save(h4);
		};
	}
	
	
	
	
	
}
