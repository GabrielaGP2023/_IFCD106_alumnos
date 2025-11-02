package com.hazerta.presentacion;

import com.hazerta.modelo.Producto;

import java.util.function.Consumer;

public class EjemplosConsumidor {

// 1.   Consumidor para imprimir en mayúsculas:
// Tomar una cadena de texto y mostrarla en mayúsculas.
    public void metodo1() {
        Consumer<String> mayusculas = s ->System.out.println(s.toUpperCase());
        mayusculas.accept("hola mundo");
    }

//    Consumidor para imprimir en mayúsculas:
//    Tomar una cadena de texto y mostrarla en mayúsculas.
    public void metodo2() {
        Consumer<Integer> cuadrado = x ->System.out.println(x * x);
        cuadrado.accept(5);
    }
//    Consumidor para imprimir detalles de un producto:
//    Tomar un objeto Producto y mostrar sus detalles como nombre, precio, etc.
    public void metodo3() {
        Producto p= new Producto(1,"Laptop");
        Consumer<Producto> mostrarProducto = prod -> System.out.println(prod);
        mostrarProducto.accept(p);
    }


    public static void main(String[] args) {
        EjemplosConsumidor e1 = new EjemplosConsumidor();
//        e1.metodo1();
//        e1.metodo2();
        e1.metodo3();
    }
}
