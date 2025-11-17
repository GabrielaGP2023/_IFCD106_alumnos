package com.hazerta.web.repositorio;

import com.hazerta.web.modelo.Tarea;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RepositorioTareaImpl implements IRepositorioTarea{
    @Override
    public List<Tarea> obtenerTodasLasTareas() {
        return List.of(new Tarea(1L, "Tarea de ejemplo", false),
                       new Tarea(2L, "Otra tarea de ejemplo", true));
    }

    @Override
    public Tarea obtenerTareaPorId(Long id) {
        return new Tarea(id, "Tarea con ID " + id, true);
    }

    @Override
    public Tarea guardarTarea(Tarea tarea) {
        return new Tarea(1L, "Tarea con ID ", true);
    }

    @Override
    public void eliminarTarea(Long id) {

    }
}
