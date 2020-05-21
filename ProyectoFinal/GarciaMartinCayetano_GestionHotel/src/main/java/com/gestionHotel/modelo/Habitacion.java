package com.gestionHotel.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Habitacion {
	@Id@GeneratedValue
	private long id;
	@Column(unique = true) 
	private int numPuerta;
	private String tipo;
	private double precio;
	
	public Habitacion(int numPuerta, String tipo, double precio) {
		super();
		this.numPuerta = numPuerta;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
	
}
