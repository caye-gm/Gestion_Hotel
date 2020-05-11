package com.gestionHotel.modelo;

import java.time.LocalDate;
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
@Data
@NoArgsConstructor

@Entity
public class Actividad {

	@Id @GeneratedValue
	private long id;
	
	
	private String nombre;
	private LocalDate horaInicio,duracion;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy="actividades",fetch = FetchType.EAGER)
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public Actividad(String nombre, LocalDate horaInicio, LocalDate duracion, List<Usuario> usuarios) {
		super();
		this.nombre = nombre;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.usuarios = usuarios;
	}

	
	
	
	
	
	
	
}
