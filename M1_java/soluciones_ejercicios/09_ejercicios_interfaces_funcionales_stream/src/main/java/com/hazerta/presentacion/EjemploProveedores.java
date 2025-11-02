package com.hazerta.presentacion;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class EjemploProveedores {
//    Proveedor de números aleatorios:
//    Generar un número aleatorio en el rango especificado.
    public void metodo1() {
        Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100);
        System.out.println(numeroAleatorio.get());
        System.out.println("Otro número aleatorio: " + numeroAleatorio.get());
    }
//    Proveedor de una lista predefinida.
//    Devolver una lista predefinida de elementos.
    public void metodo2() {
        Supplier<List<String>> lista = () -> List.of("Hola","Mundo","Java");
        System.out.println(lista.get());

    }
//    Proveedor de fecha y hora actual: Obtener la fecha y hora actual del sistema
public void metodo3() {
    Supplier<LocalDateTime> fechaHoraActual = LocalDateTime::now;

    System.out.println("Fecha y hora actual: " + fechaHoraActual.get());
}
//Proveedor de un nuevo objeto String vacío: Crear y devolver una cadena de texto vacía.
public void metodo4() {
    Supplier<String> cadenaVacia = String::new;

    System.out.println("Cadena vacía: '" + cadenaVacia.get() + "'");
}

    public static void main(String[] args) {
       EjemploProveedores ep1 = new EjemploProveedores();
//       ep1.metodo1();
         ep1.metodo2();
        ep1.metodo3();
        ep1.metodo4();
    }
}
