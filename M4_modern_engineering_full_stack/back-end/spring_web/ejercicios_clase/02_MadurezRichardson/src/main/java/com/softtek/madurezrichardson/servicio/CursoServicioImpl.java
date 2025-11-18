package com.softtek.madurezrichardson.servicio;

import com.softtek.madurezrichardson.modelo.Curso;
import com.softtek.madurezrichardson.repositorio.ICursoRepo;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursoServicioImpl implements ICursoServicio
{
    @Autowired
    private ICursoRepo repo;

    @Override
    public List<Curso> consultarTodos() {
        return repo.consultarTodos();
    }

    @Override
    public Curso consultarUno(int id) {
        return repo.consultarUno(id);
    }

    @Override
    public Curso crear(Curso curso) {
        return repo.crear(curso);
    }

    @Override
    public Curso modificar(Curso curso) {
        return repo.modificar(curso);
    }

    @Override
    public void eliminar(int id) {
        repo.eliminar(id);
    }
}
