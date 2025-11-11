package com.hazerta.data2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados_futbol")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpleadoFutbol {
    @Id
    private int idEmpleado;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 60, nullable = false)
    private String posicion;
    private boolean equipacion;
    @OneToOne
    @JoinColumn(name = "id_empleado", nullable = false,
            foreignKey = @ForeignKey(name = "FK_EmpleadoFutbol_Empleado"),
            referencedColumnName = "idEmpleado")
    private Empleado empleado;
}
