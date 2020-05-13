package com.gestionHotel.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("D")
public class Doble extends Habitacion{

public Doble(double precio) {
	super(precio);
}

	
}
