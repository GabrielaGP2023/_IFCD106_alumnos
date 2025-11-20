package com.hazerta.consultas.definicionbbdd.primary.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "conductores")
public class Conductor {
    @Id
    @Column(length = 10)
    private String dni;
    @Column(length = 60)
    private String  nombre;

    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
}

