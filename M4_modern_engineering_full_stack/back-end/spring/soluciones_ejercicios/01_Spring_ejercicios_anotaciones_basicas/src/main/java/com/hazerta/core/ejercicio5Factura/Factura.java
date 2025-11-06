package com.hazerta.core.ejercicio5Factura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Factura {
    @Autowired
    private IImpuesto impuesto;

    private List<Producto> productos;

    public double calcularTotalFactura() {
        double total = 0.0;

        for (Producto p : productos) {
            total += p.getPrecio() + impuesto.calcularImpuesto(p);
        }

        return total;
    }

    public Factura() {
    }

    public Factura(IImpuesto impuesto, List<Producto> productos) {
        this.impuesto = impuesto;
        this.productos = productos;
    }

    public IImpuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(IImpuesto impuesto) {
        this.impuesto = impuesto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
