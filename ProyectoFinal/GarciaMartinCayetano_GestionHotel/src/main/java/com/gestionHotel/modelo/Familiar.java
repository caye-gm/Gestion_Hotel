package com.gestionHotel.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@DiscriminatorValue("F")
public class Familiar extends Habitacion{



	public Familiar(int numPuerta, String tipo, double precio) {
		super(numPuerta, tipo, precio);
	}
	

	
	
	
	
}
