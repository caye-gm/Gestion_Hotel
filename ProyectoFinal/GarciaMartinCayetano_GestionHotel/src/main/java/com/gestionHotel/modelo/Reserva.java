package com.gestionHotel.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Reserva {
	
	@Id@GeneratedValue
	private long id;
	private LocalDate fecha_entrada,fecha_Salida;

	@ManyToOne
	private Usuario usuario;

	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy="reserva", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LineaReserva> lineaReserva = new ArrayList<>();

	
	/*constructores*/
	
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

	public Reserva(LocalDate fecha_entrada, LocalDate fecha_Salida, List<LineaReserva> lineaReserva) {
		super();
		this.fecha_entrada = fecha_entrada;
		this.fecha_Salida = fecha_Salida;
		this.lineaReserva = lineaReserva;
	}
	
	

	//metodos helper de onetomany
	
	public void addLineaReserva(LineaReserva a) {
		a.setReserva(this);
		this.lineaReserva.add(a);
	}
	
	
	public void removeLineaReserva(LineaReserva a) {
		this.lineaReserva.remove(a);
		a.setReserva(null);
	}

	

	


	

	



}


