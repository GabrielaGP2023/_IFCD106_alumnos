package com.hazerta.ejercicios.ejercicio3;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "bicicletas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Bicicleta {
    @Id
    private String numSerie;
    @Column(length = 30, nullable = false)
    private String marca;
    private double precio;

}
