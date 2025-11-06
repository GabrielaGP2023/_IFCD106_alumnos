package com.hazerta.core.ejercicio5Factura;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class IvaGeneral implements IImpuesto{
    public static double IVA = 0.21;
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*IVA;
    }
}
