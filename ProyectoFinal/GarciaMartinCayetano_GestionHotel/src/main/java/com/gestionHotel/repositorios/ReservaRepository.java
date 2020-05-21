package com.gestionHotel.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestionHotel.modelo.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{

	@Query(value="SELECT * FROM RESERVA WHERE USUARIO_ID=?1", nativeQuery=true)
    List<Reserva> reservasUsuario(long id) ;
}
