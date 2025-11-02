package com.hazerta.presentacion;


import com.hazerta.modelo.DetallePedidos;
import com.hazerta.modelo.Producto;
import com.hazerta.persistencia.AccesoDetallesPedidos;
import com.hazerta.persistencia.AccesoProductos;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploStreamOrderDetails {
    private List<DetallePedidos> detalles;

    public EjemploStreamOrderDetails() {
        this.detalles = cargarDetalles();
    }

    private List<DetallePedidos> cargarDetalles() {
        AccesoDetallesPedidos acceso = new AccesoDetallesPedidos();
        try {
            return acceso.obtenerDetalles();
        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error de clase no encontrada: " + e.getMessage());
        }
        return Collections.emptyList(); // evita NullPointerException
    }
//1.		Obtener los detalles de ordenes cuyo precio unitario sea mayor que 30.
    public void ejercicio1() {
        detalles.stream()
                .filter(dp ->dp.getPrecio()>30)
                .forEach(System.out::println);
    }
    // 2. 	Ordenar los productos de forma descendente por unit_price
    public void ejercicio2(){
        detalles.stream()
                .sorted(Comparator.comparingDouble(DetallePedidos::getPrecio).reversed())
                .forEach(System.out::println);
    }
    //3.	Obtener el detalle de ordenes cuyo precio es el mínimo
    public void ejercicio3(){
        detalles.stream()
                .min(Comparator.comparingDouble(DetallePedidos::getPrecio))
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No se encontraron detalles de pedidos.")
                );
    }
    // 4.	Calcular el precio promedio de los detalles de ordenes
    public static void main(String[] args) {
        EjemploStreamOrderDetails ejemplo = new EjemploStreamOrderDetails();
        ejemplo.ejercicio3();
    }
}
