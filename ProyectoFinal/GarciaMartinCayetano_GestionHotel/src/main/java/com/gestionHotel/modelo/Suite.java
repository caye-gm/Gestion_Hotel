package com.gestionHotel.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
public class Suite extends Habitacion{

	private int camas;

	public Suite(double precio, int camas) {
		super(precio);
		this.camas = camas;
	}

	public int getCamas() {
		return camas;
	}

	public void setCamas(int camas) {
		this.camas = camas;
	}

	@Override
	public String toString() {
		return "Suite [camas=" + camas + "]";
	}
	
	
	
}
