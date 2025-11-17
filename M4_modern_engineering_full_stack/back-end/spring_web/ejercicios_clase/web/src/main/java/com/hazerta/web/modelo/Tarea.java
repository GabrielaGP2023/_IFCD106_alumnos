package com.hazerta.web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tarea {
    private Long id;
    private String titulo;
    private boolean completada;
}
