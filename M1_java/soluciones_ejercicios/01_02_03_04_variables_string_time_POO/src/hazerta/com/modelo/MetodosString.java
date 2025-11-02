package hazerta.com.modelo;

public class MetodosString {
    public static void main(String[] args) {
         /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */

        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";


        //mayusulas
        System.out.println(frase.toUpperCase());
        //minusculas
        System.out.println(frase.toLowerCase());
        //solo nunca
        System.out.println("(" + frase.substring(frase.indexOf("Nunca"), frase.indexOf("Nunca") + "Nunca".length()) + ")");
        //solo mosca
        System.out.println("("+frase.substring(frase.indexOf("mosca"), frase.indexOf("mosca")+"mosca".length())+")");
        //solo cabeza
        System.out.println("("+frase.substring(frase.indexOf("cabeza"),frase.indexOf("cabeza")+ "cabeza".length())+")");
        // Posición de la primera 'm'
        System.out.println("Primera 'm' en posición: " + frase.indexOf('m'));

        // Longitud de la cadena
        System.out.println("Longitud de la cadena: " + frase.length());
    }

    }

