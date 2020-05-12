package com.gestionHotel.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestionHotel.modelo.LineaReserva;

public interface LineaReservaRepository extends JpaRepository<LineaReserva,Long>{

	
}
