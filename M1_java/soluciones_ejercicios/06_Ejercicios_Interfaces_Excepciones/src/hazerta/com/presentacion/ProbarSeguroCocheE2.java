package hazerta.com.presentacion;

import hazerta.com.modelo.ejercicio2SeguroCoche.*;

public class ProbarSeguroCocheE2 {
    public static void main(String[] args) {
        Coche c1 = new Coche("1234ABC", "Auris");
        ITaller t1 = new TallerPintura();
        ITaller t2 = new TallerMecanica();
        SeguroCoche s1 = new SeguroCoche(t2,"Mapfre");
        System.out.println(s1.reparar(c1));
    }
}
