package com.gestionHotel.servicios;

import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.gestionHotel.modelo.*;
import com.gestionHotel.repositorios.*;
import com.gestionHotel.servicios.base.BaseService;
@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepository>{

	public UsuarioServicio(UsuarioRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Optional<Usuario> buscarPorUsuario(String usuario) {
		return repositorio.findFirstByUsername(usuario);
	}
	
	public Usuario registrar(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		usuario.setPassword(encoder.encode(usuario.getPassword()));
		return repositorio.save(usuario);
	}
	public void cambiarPass(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		usuario.setPassword(encoder.encode(usuario.getPassword()));
	
	
	}
}
