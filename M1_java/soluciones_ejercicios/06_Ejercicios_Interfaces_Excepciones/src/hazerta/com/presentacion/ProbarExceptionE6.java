package hazerta.com.presentacion;

import hazerta.com.modelo.Ejercicio6Excepciones.Producto;
import hazerta.com.modelo.Ejercicio6Excepciones.ProductoException;

public class ProbarExceptionE6 {
    public static void main(String[] args) {
        System.out.println("Probar Exception E6");
        Producto p1 = new Producto();
        try {
            p1.comprobar();
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
        }

    }
}
