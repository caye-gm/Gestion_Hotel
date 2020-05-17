package com.gestionHotel.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data@NoArgsConstructor
@Entity
public class PlantillaActividades {
	@Id@GeneratedValue
	private long id;
	private String nombre,descripcion;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate duracion;
	
	
	public PlantillaActividades(String nombre, String descripcion, LocalDate duracion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
	}
	
	
}
