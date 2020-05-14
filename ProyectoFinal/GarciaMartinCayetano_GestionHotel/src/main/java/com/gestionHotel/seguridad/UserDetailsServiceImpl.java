package com.gestionHotel.seguridad;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gestionHotel.servicios.UsuarioServicio;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService{

	private final UsuarioServicio usuarioServicio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
			return usuarioServicio.buscarPorUsuario(username)
					.orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
	}

	
	
	
	
}
