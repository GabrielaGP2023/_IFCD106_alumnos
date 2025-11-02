package hazerta.com.presentacion.poo;


import hazerta.com.modelo.poo.Campos;

public class ProbarCampos {
    public static void main(String[] args) {
        Campos campos = new Campos(10);

        campos.incrementa();

        System.out.println("El valor de x es: " + campos.muestra());
    }
}
