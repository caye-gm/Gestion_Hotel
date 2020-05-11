package com.gestionHotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionHotel.modelo.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
