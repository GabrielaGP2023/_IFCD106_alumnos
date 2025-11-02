package com.hazerta.presentacion;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicados {
//    1. Predicado para números positivos: Verificar si un número entero es positivo.



    public void metodo1() {
        Predicate<Integer> positivos = x -> x> 0;
        System.out.println(positivos.test(-1));
    }
    //2.     Predicado para cadenas no vacías: Comprobar si una cadena de texto no está vacía.
    public void metodo2() {
        Predicate<String> noVacia = s -> s !=null && !s.isEmpty();
        System.out.println(noVacia.test(""));
        System.out.println(noVacia.test("Hola"));
    }
    //3.     Predicado para números pares: Determinar si un número entero es par.
    public void metodo3() {
        Predicate<Integer> esPar = x -> x%2 == 0;
        System.out.println(esPar.test(4));
        System.out.println(esPar.test(5));

    }
    //4. Predicado para números mayores que un valor dado. Comprobar si un número entero es mayor que un valor específico.
    public void metodo4() {
        BiPredicate<Integer,Integer> esMayor = (x,y) -> x > y;
        System.out.println(esMayor.test(4,5));
        System.out.println(esMayor.test(6,5));}

    public static void main(String[] args) {
        EjemploPredicados e1 = new EjemploPredicados();
//        e1.metodo1();
        e1.metodo2();
//        e1.metodo3();
//        e1.metodo4();
    }

}
