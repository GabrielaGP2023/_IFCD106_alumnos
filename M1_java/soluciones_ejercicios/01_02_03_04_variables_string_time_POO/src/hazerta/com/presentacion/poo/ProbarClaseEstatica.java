package hazerta.com.presentacion.poo;

import hazerta.com.modelo.ejemploestaticas.Calculadora;
import hazerta.com.modelo.ejemploestaticas.Contador;

public class ProbarClaseEstatica {
    public static void main(String[] args) {
        System.out.println(Contador.getContadorGlobal());
        Contador c1 = new Contador();
        System.out.println(Contador.getContadorGlobal());
        System.out.println(c1.toString());
        Contador c2 = new Contador();
        System.out.println(c2.toString());
        System.out.println(Contador.contadorGlobal);
        System.out.println(Calculadora.divide(10,2));
    }
}
