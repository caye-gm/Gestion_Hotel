package com.gestionHotel.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("F")
public class Familiar extends Habitacion{


	public Familiar(double precio) {
		super(precio);
	}

	
	
	
	
}