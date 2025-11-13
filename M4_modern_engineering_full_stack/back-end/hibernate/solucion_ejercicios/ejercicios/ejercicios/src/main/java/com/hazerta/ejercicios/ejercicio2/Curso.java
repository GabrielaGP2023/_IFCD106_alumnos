package com.hazerta.ejercicios.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String nombre;
    private int creditos;

    @ManyToMany
    @JoinTable(
        name = "alumnos_cursos",
        joinColumns = @JoinColumn(name = "id_curso", foreignKey = @ForeignKey(name="FK_alumnos_cursos_cursos"),referencedColumnName = "idCurso"),
        inverseJoinColumns = @JoinColumn(name = "id_alumno", foreignKey = @ForeignKey(name="FK_alumno_curso_alumno"),referencedColumnName = "idAlumno")
    )
    private List<Alumno> alumnos;
}
