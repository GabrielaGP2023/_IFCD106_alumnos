package com.hazerta.web.servicio;

import com.hazerta.web.modelo.Tarea;

import java.util.List;

public interface IServicioTarea {
    List<Tarea> obtenerTodasLasTareas();
    Tarea obtenerTareaPorId(Long id);
    Tarea guardarTarea(Tarea tarea);
    void eliminarTarea(Long id);

}
