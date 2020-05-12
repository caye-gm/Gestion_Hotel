package com.gestionHotel.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Reserva {
	@Id@GeneratedValue
	private long id;
	private LocalDate fecha_entrada,fecha_Salida;

	@ManyToOne
	private Usuario usuario;

	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Habitacion> habitaciones = new ArrayList<Habitacion>();
	
	
	/** MÉTODOS HELPERS **/
	
	public void addHabitaciones(Habitacion a) {
		habitaciones.add(a);
		a.getReservas().add(this);
	}
	
	public void removeHabitaciones(Habitacion a) {
		habitaciones.remove(a);
		a.getReservas().remove(this);
	}
	
	
	//constructores
	public Reserva(LocalDate fecha_entrada, LocalDate fecha_Salida) {
		super();
		this.fecha_entrada = fecha_entrada;
		this.fecha_Salida = fecha_Salida;
	}
	
	public Reserva(LocalDate fecha_entrada, LocalDate fecha_Salida, Usuario usuario) {
		super();
		this.fecha_entrada = fecha_entrada;
		this.fecha_Salida = fecha_Salida;
		this.usuario = usuario;
	}




	

	



}


