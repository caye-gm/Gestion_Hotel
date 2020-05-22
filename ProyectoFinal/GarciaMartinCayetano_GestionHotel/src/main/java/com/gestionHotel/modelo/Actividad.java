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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor

@Entity
public class Actividad {

	@Id @GeneratedValue
	private long id;
	 @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDate horaInicio;
	
	@ManyToOne
	private PlantillaActividades pa;
	
	
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy="actividades",fetch = FetchType.EAGER)
	

	
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public Actividad(LocalDate horaInicio, List<Usuario> usuarios) {
		super();
		this.horaInicio = horaInicio;
		this.usuarios = usuarios;
	}

	public Actividad(LocalDate horaInicio, PlantillaActividades pa, List<Usuario> usuarios) {
		super();
		this.horaInicio = horaInicio;
		this.pa = pa;
		this.usuarios = usuarios;
	}
	
	
	
	
	
	
	
	
}
