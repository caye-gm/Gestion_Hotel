package com.gestionHotel.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity

public class Habitacion {
	@Id@GeneratedValue
	private long id;

	private double precio;
	
	
	
	
	public Habitacion(double precio) {
		super();
		this.precio = precio;
	}

	
	
	
	
	
}
