package com.hazerta.data2.modelo._03_1_1.caso1.caso2;

import jakarta.persistence.*;
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
