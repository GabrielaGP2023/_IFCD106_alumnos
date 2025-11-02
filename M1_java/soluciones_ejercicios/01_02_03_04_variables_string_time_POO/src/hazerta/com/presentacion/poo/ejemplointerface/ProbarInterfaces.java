package hazerta.com.presentacion.poo.ejemplointerface;

import hazerta.com.modelo.ejemplointerfaces.Ave;
import hazerta.com.modelo.ejemplointerfaces.Avion;
import hazerta.com.modelo.ejemplointerfaces.Superman;

public class ProbarInterfaces {
    public static void main(String[] args) {
        Avion a1 = new Avion();
        System.out.println(a1.despegar());
        System.out.println(a1.volar());
        System.out.println(a1.aterrizar());
        Ave a2 = new Ave();
        System.out.println(a2.despegar());
        System.out.println(a2.volar());
        System.out.println(a2.aterrizar());
        Superman s1 = new Superman();
        System.out.println(s1.despegar());
        System.out.println(s1.volar());
        System.out.println(s1.aterrizar());

    }
}
