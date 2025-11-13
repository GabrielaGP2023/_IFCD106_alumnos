package com.hazerta.ejercicios.ejercicio4;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zoos")
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZoo;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 50,nullable = false)
    private String pais;
    @Column(length = 50,nullable = false)
    private String ciudad;
    private double tamano;
    private double money;


}
