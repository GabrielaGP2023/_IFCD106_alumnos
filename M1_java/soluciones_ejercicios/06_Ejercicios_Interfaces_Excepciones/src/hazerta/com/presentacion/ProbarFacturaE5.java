package hazerta.com.presentacion;

import hazerta.com.modelo.ejercicio5Factura.*;

import java.util.List;

public class ProbarFacturaE5 {
    public static void main(String[] args) {
        // Crear una instancia de Factura
        Factura f1 = new Factura();
        IImpuesto impuesto1 = new IvaSuperReducido();
        IImpuesto impuesto2 = new IvaGeneral();
        f1.setImpuesto(impuesto1);
        // Crear la lista de productos
        List<Producto> productos = List.of(
                new Producto("Leche", 1.0),
                new Producto("Pan", 1.0),
                new Producto("Yogourt", 1.0)
        );

        // Asignar los productos a la factura
        f1.setProductos(productos);

        // Calcular y mostrar el total de la factura
        System.out.println("Cálculo del total de la factura -> " + f1.calcularTotalFactura());
    }

}

