package com.gestionHotel.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
public  class Habitacion {
	@Id@GeneratedValue
	private long id;

	private double precio;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy="habitaciones",fetch = FetchType.EAGER)
	private List<Reserva> reservas = new ArrayList<>();
	
	
	
	
	public Habitacion(double precio) {
		super();
		this.precio = precio;
	}

	
	
	
	
	
}
