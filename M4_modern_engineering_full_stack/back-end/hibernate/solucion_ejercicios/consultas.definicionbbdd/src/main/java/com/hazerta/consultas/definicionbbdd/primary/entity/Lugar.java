package com.hazerta.consultas.definicionbbdd.primary.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "lugares")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLugar;
    @Column(length = 60)
    private String nombre;

    public Lugar(String nombre) {
        this.nombre = nombre;
    }
//
}
