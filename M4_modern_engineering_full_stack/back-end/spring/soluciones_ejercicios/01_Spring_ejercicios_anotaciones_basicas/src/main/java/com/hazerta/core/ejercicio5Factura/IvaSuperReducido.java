package com.hazerta.core.ejercicio5Factura;

import org.springframework.stereotype.Component;

@Component
public class IvaSuperReducido implements IImpuesto{
    public static double IVA_REDUCIDO = 0.04;
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*IVA_REDUCIDO;
    }
}
