package com.hazerta.ejercicios.ejercicio3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Electrica extends Bicicleta{
    @Column(length = 20, nullable = false)
    private String tipoMotor;
    private int potencia;
}
