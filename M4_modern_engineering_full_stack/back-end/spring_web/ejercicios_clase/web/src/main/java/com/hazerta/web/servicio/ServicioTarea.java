package com.hazerta.web.servicio;

import com.hazerta.web.modelo.Tarea;
import com.hazerta.web.repositorio.IRepositorioTarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioTarea implements IServicioTarea{
    @Autowired
    private IRepositorioTarea repositorioTarea;
    @Override
    public List<Tarea> obtenerTodasLasTareas() {
        return repositorioTarea.obtenerTodasLasTareas();
    }

    @Override
    public Tarea obtenerTareaPorId(Long id) {
        return repositorioTarea.obtenerTareaPorId(id);
    }

    @Override
    public Tarea guardarTarea(Tarea tarea) {
        return repositorioTarea.guardarTarea(tarea);
    }

    @Override
    public void eliminarTarea(Long id) {
        System.out.println("Eliminando tarea con ID: " + id);
    }
}
