package com.hazerta.core.modelo.ejercicio1Conductor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Coche implements IVehiculo{
    private int deposito;
    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche se ha movido";
        }
        return "Ir a la gasolinera";
    }
}
