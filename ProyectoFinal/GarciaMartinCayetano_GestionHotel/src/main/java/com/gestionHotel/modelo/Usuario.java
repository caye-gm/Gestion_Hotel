
package com.gestionHotel.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor

@Entity
public class Usuario implements UserDetails {

	
	private static final long serialVersionUID = 4932924958521868350L;

	@Id
	@GeneratedValue
	private long id;
	@Column(unique = true) 
	private String dni;
	private String password;
	@Column(unique = true) 
	private String telefono;
	@Column(unique = true) 
	private String email;
	
	@Column(unique = true) 
	private String username;
	
	
	private boolean admin;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(updatable = true, nullable = true)
	private List<Actividad> actividades = new ArrayList<>();

	
	
	
	public Usuario(String dni, String password, String telefono, String email, String username, boolean admin,
			List<Actividad> actividades) {
		super();
		this.dni = dni;
		this.password = password;
		this.telefono = telefono;
		this.email = email;
		this.username = username;
		this.admin = admin;
		this.actividades = actividades;
	}
	
	
	

	//helpers
	public void addActividad(Actividad a) {
		actividades.add(a);
		a.getUsuarios().add(this);
	}
	
	public void removeActividad(Actividad a) {
		a.getUsuarios().remove(this);
		actividades.remove(a);
		
	}
	public Actividad findActivityByID(Actividad a) {
		Actividad a1=null;
		for (Actividad v : actividades) {
			if (v.getId()==a.getId()) {
				 a1=v;
				 
			}
		}
		return a1;
	}




	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		String role = "ROLE_";
		if (admin) {
			role += "ADMIN";
		} else {
			role += "USER";
		}
		return Arrays.asList(new SimpleGrantedAuthority(role));
	}




	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}




	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}




	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}




	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}





	





	



	



	

	
	
	
	
	
	
}
