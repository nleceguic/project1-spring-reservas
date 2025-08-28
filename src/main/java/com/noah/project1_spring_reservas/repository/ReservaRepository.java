package com.noah.project1_spring_reservas.repository;

import com.noah.project1_spring_reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{}
