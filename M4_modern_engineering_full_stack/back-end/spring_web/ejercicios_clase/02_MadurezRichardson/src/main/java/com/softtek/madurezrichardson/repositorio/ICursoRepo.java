package com.softtek.madurezrichardson.repositorio;

import com.softtek.madurezrichardson.modelo.Curso;

import java.util.List;

public interface ICursoRepo {

    List<Curso> consultarTodos();
    Curso consultarUno(int id);
    Curso crear(Curso curso);

    Curso modificar(Curso curso);

    void eliminar(int id);


}
