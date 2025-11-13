package com.hazerta.data2.modelo._01_1_N;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "departamentos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Departamento {
    @Id
    private int idDepartamento;
    @Column(length = 50, nullable = false)
    private String nombre;

    private Integer numEmpleados;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Empleado> empleados;



}
