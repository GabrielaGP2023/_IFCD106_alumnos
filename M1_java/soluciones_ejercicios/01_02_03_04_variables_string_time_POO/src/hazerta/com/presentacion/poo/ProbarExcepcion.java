package hazerta.com.presentacion.poo;

import hazerta.com.modelo.poo.ExcepcionPersonalizada;
import hazerta.com.modelo.poo.Fecha;

public class ProbarExcepcion {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        try {
            f1.setMes(40);
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ultima linea");
    }
}
