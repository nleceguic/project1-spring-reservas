package com.noah.project1_spring_reservas.service;

import com.noah.project1_spring_reservas.model.Reserva;
import com.noah.project1_spring_reservas.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public class ReservaService {
    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public List<Reserva> findAll() {
        return repository.findAll();
    }

    public Reserva save(Reserva reserva) {
        return repository.save(reserva);
    }

    public Reserva findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Reserva no encontrada"));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
