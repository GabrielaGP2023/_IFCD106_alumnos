package com.hazerta.data2.modelo._02_N_M.caso1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    @ManyToMany(mappedBy = "productos", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Proveedor> proveedores;
}
