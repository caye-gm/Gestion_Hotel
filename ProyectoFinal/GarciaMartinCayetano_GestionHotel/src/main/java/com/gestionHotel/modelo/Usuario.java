package com.gestionHotel.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private long id;
	
	private String dni,nombre,telefono,email;
	private boolean admin;
	
	@ManyToMany(fetch = FetchType.EAGER)
	
	private List<Actividad> actividades = new ArrayList<Actividad>();

	
	
	
	
	public Usuario(String dni, String nombre, String telefono, String email, boolean admin,
			List<Actividad> actividades) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.admin = admin;
		this.actividades = actividades;
	}
	
	

	//helpers
	public void addActividad(Actividad a) {
		actividades.add(a);
		a.getUsuarios().add(this);
	}
	
	public void removeActividad(Actividad a) {
		actividades.remove(a);
		a.getUsuarios().remove(this);
	}
	
	
	
	
	
	
}
