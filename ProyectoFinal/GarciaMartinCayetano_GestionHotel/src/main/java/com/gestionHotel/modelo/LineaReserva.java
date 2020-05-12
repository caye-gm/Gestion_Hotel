package com.gestionHotel.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data@NoArgsConstructor@AllArgsConstructor
@Entity
public class LineaReserva {

	@Id@GeneratedValue
	private Long id_linea;

	private double precio_noche;
	
	
	@ManyToOne
	private Reserva reserva;

	@ManyToOne
	private Habitacion habitacion;
	
	public LineaReserva(double precio_noche) {
		super();
		this.precio_noche = precio_noche;
	}
	
	
	
}
