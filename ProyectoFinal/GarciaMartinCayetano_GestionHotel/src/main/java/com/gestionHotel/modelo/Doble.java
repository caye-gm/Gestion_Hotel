package com.gestionHotel.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor

@Entity
@DiscriminatorValue("D")
public class Doble extends Habitacion{

	

	public Doble(int numPuerta, String tipo, double precio) {
		super(numPuerta, tipo, precio);
	}
	

}

	

