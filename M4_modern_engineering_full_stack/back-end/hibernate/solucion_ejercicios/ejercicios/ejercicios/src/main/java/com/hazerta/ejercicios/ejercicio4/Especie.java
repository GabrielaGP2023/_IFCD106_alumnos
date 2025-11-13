package com.hazerta.ejercicios.ejercicio4;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 50,nullable = false)
    private String nombreCientifico;
    @Column(length = 50,nullable = false)
    private String nombreVulgar;
    @Column(length = 50,nullable = false)
    private String familia;
    private boolean peligroExtinsion;
    //Opcional
    //Unicamente si el Front lo necesita


}
