package com.gestionHotel.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Entity
@DiscriminatorValue("I")
public class Individual extends Habitacion {
	

	public Individual(double precio) {
		super(precio);
	}
	
	
}
