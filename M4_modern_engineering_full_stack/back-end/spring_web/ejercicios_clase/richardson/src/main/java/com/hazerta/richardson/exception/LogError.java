package com.hazerta.richardson.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LogError {
    private LocalDate fecha;
    private String Detalle;

}
