package com.hazerta.web.repositorio;

import com.hazerta.web.modelo.Tarea;

import java.util.List;

public interface IRepositorioTarea {
    List<Tarea> obtenerTodasLasTareas();
    Tarea obtenerTareaPorId(Long id);
    Tarea guardarTarea(Tarea tarea);
    void eliminarTarea(Long id);
}
