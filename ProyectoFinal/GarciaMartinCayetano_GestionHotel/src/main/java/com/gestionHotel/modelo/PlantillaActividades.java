package com.gestionHotel.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data@NoArgsConstructor
@Entity
public class PlantillaActividades {
	@Id@GeneratedValue
	private long id;
	private String nombre,descripcion;
	
	
	private double duracion;
	
	
	public PlantillaActividades(String nombre, String descripcion, double duracion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
	}
	
	
}
