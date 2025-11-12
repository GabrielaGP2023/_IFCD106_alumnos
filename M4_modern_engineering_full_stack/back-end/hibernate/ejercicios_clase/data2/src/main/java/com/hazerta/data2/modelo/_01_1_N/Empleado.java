package com.hazerta.data2.modelo._01_1_N;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empleado {
    @Id
    private int idEmpleado;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 60, nullable = false)
    private String puesto;
    private double salario;
    @ManyToOne
    @JoinColumn(name = "idDepartamento", nullable = false, foreignKey = @ForeignKey(name = "FK_Empleado_Departamento"))
    private Departamento departamento;

}
