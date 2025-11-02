package hazerta.com.presentacion;

import hazerta.com.modelo.ejercicio1Conductor.Coche;
import hazerta.com.modelo.ejercicio1Conductor.Conductor;
import hazerta.com.modelo.ejercicio1Conductor.IVehiculo;

public class ProbarConductorE1 {
    public static void main(String[] args) {
        IVehiculo iv1 = new Coche(85);
        Conductor c1 = new Conductor(iv1);
        System.out.println(c1.conducir());
    }
}
