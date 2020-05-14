package com.gestionHotel.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionHotel.modelo.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findFirstByUsername(String username);
}
