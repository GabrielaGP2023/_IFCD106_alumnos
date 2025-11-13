package com.hazerta.ejercicios.ejercicio1;

import jakarta.persistence.*;

@Entity
@Table(name="detalle_ordenes")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int secuencia;

    private int idProducto;
    private int cantidad;
    private double precioUnitario;

    @ManyToOne
    @JoinColumn(name="id_orden", foreignKey = @ForeignKey(name = "FK_DETALLE_ORDENES_ORDENES"),referencedColumnName = "idOrden")
    private Orden orden;
}
