package com.hazerta.web.controlador;

import com.hazerta.web.modelo.Tarea;
import com.hazerta.web.servicio.IServicioTarea;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class ControladorTarea {
    @Autowired
    private IServicioTarea servicioTarea;

    @GetMapping
    public List<Tarea> obtenerTodasLasTareas() {
        return servicioTarea.obtenerTodasLasTareas();
    }
    @GetMapping("/{id}")
    public Tarea obtenerTareaPorId(@PathVariable("id") Long id) {
        return servicioTarea.obtenerTareaPorId(id);
    }
    @PostMapping
    public Tarea guardarTarea(Tarea tarea) {
        return servicioTarea.guardarTarea(tarea);
    }
}
