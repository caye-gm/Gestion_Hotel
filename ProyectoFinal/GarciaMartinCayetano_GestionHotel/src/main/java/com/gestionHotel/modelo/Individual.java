package com.gestionHotel.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Entity
@DiscriminatorValue("I")
public class Individual extends Habitacion {
	

	

	public Individual(int numPuerta, String tipo, double precio) {
		super(numPuerta, tipo, precio);
	}
	
	
}
