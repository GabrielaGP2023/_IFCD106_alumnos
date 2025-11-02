package hazerta.com.presentacion.poo;


import hazerta.com.modelo.poo.Areas;

public class ProbarAreas {
    public static void main(String[] args) {
        Areas a1= new Areas();

        System.out.println("El área del círculo es: " +a1.areaCirculo(1) );


        System.out.println("El área del rectángulo es: " + a1.areaRectangulo(4,3));

    }
}
