package hazerta.com.modelo;

public class TiposPrimitivos {
    public static void main(String[] args) {

//        Declara dos variables enteras a y b e imprime su suma.
//        Declara dos variables de punto flotante x y y e imprime su producto.
//        Declara una variable letra de tipo char e imprime su valor.
//        Declara una variable verdadero de tipo boolean y asígnale el valor true. Imprime su valor.
//        Declara una variable mensaje de tipo String e imprime su contenido.
//        Declara e inicializa tres variables enteras x, y y z en una sola línea y calcula su suma.
//        Declara dos variables enteras a y b. Calcula y muestra la suma, resta, multiplicación y división de estas variables.
//        SINTAXIS
//        <TIPO> <NOMBRE> = VALOR;

        int a=5, b=4;
        System.out.println("suma : " + (a+b));
        float x=5.1f , y=4.0f;
        System.out.println("producto : " + (x*y));
        char letra = 'g';
        System.out.println("letra : " + letra);
        boolean verdadero = true;
        System.out.println("verdadero : " + verdadero);
        String mensaje ="Buenos días";
        System.out.println(mensaje);
        int xE=2, yE=5, zE=3;
        System.out.println("Suma : " + (xE+yE+zE));
        int aE=10, bE=5;
        System.out.println("Suma : " + (aE + bE));
        System.out.println("Resta : " + (aE - bE));
        System.out.println("Multiplicación : " + (aE * bE));
        System.out.println("division : " + (aE / bE));



    }
}