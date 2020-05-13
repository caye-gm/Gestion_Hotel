package com.gestionHotel.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gestionHotel.modelo.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}
