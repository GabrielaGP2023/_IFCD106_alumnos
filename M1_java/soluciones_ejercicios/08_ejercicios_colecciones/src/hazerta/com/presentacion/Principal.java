package hazerta.com.presentacion;

import java.util.*;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        //Ejercicio 1
        //Cree una clase que tenga un objeto de la clase HashSet,
        // que añada varias cadenas al objeto
        // e imprima todas las cadenas.
        // Utilizar el tipo genérico String.
        Set<String> palabras = new HashSet<>();
        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Desde");
        palabras.add("Java");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        System.out.println("Usando Stream:");
        Stream<String> streamPalabras = palabras.stream();
        streamPalabras.forEach(System.out::println);

//        Ejercicio 2
//        Cree un objeto de la clase ArrayList,
//        añada una lista de cadenas y conviértalo a un Stream.
        System.out.println("Ejercicio 2:");
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Uno");
        listaCadenas.add("Dos");
        listaCadenas.add("Tres");
        listaCadenas.add("Cuatro");
        // Convertir a Stream
        Stream<String> streamCadenas = listaCadenas.stream();
        System.out.println("Stream de cadenas:");
        streamCadenas.forEach(System.out::println);
        //De Stream a ArrayList
        listaCadenas = new ArrayList<>(listaCadenas.stream().toList()); // asegura ArrayList
        for (String elemento : listaCadenas) {
            System.out.println(elemento);
        }

    //Ejercicio 3
    //Cree un programa almacene números del 0 al 9 en un array y en una lista,
    // e imprima sus valores.
        System.out.println("Ejercicio 3:");
        // Array
        int[] numerosArray = new int[10];
        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = i;
        }
        System.out.println("Array:");
        for (int numero : numerosArray) {
            System.out.println(numero);
        }
        // Lista
        List<Integer> numerosLista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numerosLista.add(i);
        }
        System.out.println("Lista:");
        for (int numero : numerosLista) {
            System.out.println(numero);
        }
        //Ejercicio 4
        //Cree un programa que almacene la nota de una asignatura de varios alumnos en una colección de tipo Map.
        // El alumno se identificará por su nombre.
        //Cada elemento del mapa estará formado por nombre de tipo String y nota de tipo Integer.
        // Utilizar tipos genéricos.
        System.out.println("Ejercicio 4:");
        Map<String, Integer> notasAlumnos = new HashMap<>();
        notasAlumnos.put("Juan", 85);
        notasAlumnos.put("María", 92);
        notasAlumnos.put("Pedro", 78);
        for (Map.Entry<String, Integer> elemento : notasAlumnos.entrySet()) {
            System.out.println("Alumno: " + elemento.getKey() + ", Nota: " + elemento.getValue());
            //Ejercicio 5
            //Cree un programa que implemente un diccionario.
            // El diccionario debe contener palabras en castellano y una lista de posibles significados de cada palabra.
            //Crear la clase Palabra que permita almacenar la información de una palabra, junto con sus definiciones.
            //Utilizar un objeto HashMap para almacenar palabras en la clase Diccionario.
            Map<String, List<String>> diccionario = new HashMap<>();
            diccionario.put("Casa", Arrays.asList("Edificio para habitar", "Hogar familiar"));
            diccionario.put("Perro", Arrays.asList("Animal doméstico", "Amigo fiel"));
            for (Map.Entry<String, List<String>> entrada : diccionario.entrySet()) {
                System.out.println("Palabra: " + entrada.getKey() + ", Definiciones: " + entrada.getValue());
            }

        }
    }
}
