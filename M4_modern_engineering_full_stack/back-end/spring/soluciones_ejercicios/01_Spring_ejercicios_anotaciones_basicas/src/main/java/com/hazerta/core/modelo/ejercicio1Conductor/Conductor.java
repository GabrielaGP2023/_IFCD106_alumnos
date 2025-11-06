package com.hazerta.core.modelo.ejercicio1Conductor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Conductor {
    @Autowired
    private IVehiculo vehiculo;

    public String conducir() {
        return vehiculo.moverse();
    }
}
