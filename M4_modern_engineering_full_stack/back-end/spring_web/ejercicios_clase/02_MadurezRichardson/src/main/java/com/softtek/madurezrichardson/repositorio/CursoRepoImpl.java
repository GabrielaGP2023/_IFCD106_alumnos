package com.softtek.madurezrichardson.repositorio;

import com.softtek.madurezrichardson.modelo.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Repository
public class CursoRepoImpl implements ICursoRepo{

    private List<Curso> cursos = new ArrayList<Curso>();

    @Override
    public List<Curso> consultarTodos() {
        return cursos;
    }

    @Override
    public Curso consultarUno(int id) {
        Optional<Curso> result = cursos.stream().filter(curso-> curso.getIdCurso() == id).collect(Collectors.toList()).stream().findFirst();
        return result.isPresent()?result.get():null;
    }

    @Override
    public Curso crear(Curso curso) {
        cursos.add(curso);
        return curso;
    }

    @Override
    public Curso modificar(Curso curso) {
        Optional<Curso> aModificar = cursos.stream().filter(c-> c.getIdCurso() == curso.getIdCurso()).collect(Collectors.toList()).stream().findFirst();
        aModificar.ifPresent(objeto -> objeto = curso);
        return aModificar.isPresent()?aModificar.get() : null;
    }

    @Override
    public void eliminar(int id) {
        cursos.removeIf(c -> c.getIdCurso() == id);
    }
}
