package com.hazerta.data2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    @Column(length = 60, nullable = false)
    private String nombre;
    private double precio;
    private int cantidadExistencia;
}
