package hazerta.com.presentacion.poo;

public class EjemploExcepciones {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        try{
            numeros[4]=5;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

        System.out.println("ultima línea");

    }
}
