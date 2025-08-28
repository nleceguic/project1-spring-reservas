package controller;

import com.noah.project1_spring_reservas.model.Reserva;
import com.noah.project1_spring_reservas.service.ReservaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Reserva> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Reserva create(@RequestBody Reserva reserva) {
        return service.save(reserva);
    }

    @PutMapping("/{id}")
    public Reserva update(@PathVariable Long id, @RequestBody Reserva reserva) {
        Reserva existing = service.findById(id);
        existing.setNombreUsuario(reserva.getNombreUsuario());
        existing.setFechaReserva(reserva.getFechaReserva());
        existing.setPersonas(reserva.getPersonas());
        return service.save(existing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
