package com.hazerta.presentacion;

import com.hazerta.modelo.Producto;
import com.hazerta.persistencia.AccesoProductos;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploStreamProductos {
    private List<Producto> productos;

    public EjemploStreamProductos() {
        this.productos = cargarProductos();
    }

    private List<Producto> cargarProductos() {
        AccesoProductos acceso = new AccesoProductos();
        try {
            return acceso.obtenerProductos();
        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error de clase no encontrada: " + e.getMessage());
        }
        return Collections.emptyList(); // evita NullPointerException
    }
//1.	Obtener los productos cuya categoría sea 2
    public void ejercicio1() {
        productos.stream()
                .filter(p -> p.getCategoriaId() == 2)
                .forEach(System.out::println);
    }
    // 2. Obtener los productos que comiencen con N
    public void ejercicio2() {
        productos.stream()
                .filter(p -> p.getNombre() != null)                 // evita NullPointerException
                .filter(p -> p.getNombre().toUpperCase().startsWith("N")) // filtra los que empiezan con N o n
                .forEach(System.out::println);
    }
    // 3. Ordenar los productos de forma ascendente por nombre de producto
    public void ejercicio3() {
        productos.stream()
                .filter(p -> p.getNombre() != null && !p.getNombre().isBlank()) // filtra nulos y vacíos
                .sorted(Comparator.comparing(
                        Producto::getNombre,
                        String.CASE_INSENSITIVE_ORDER // ignora mayúsculas/minúsculas
                ))
                .forEach(System.out::println);
    }
    // 4. Obtener el producto con el precio máximo
    public void ejercicio4() {
        productos.stream()
                .filter(p -> p.getPrecio() != null) // evita NullPointerException
                .max(Comparator.comparing(Producto::getPrecio)) // obtiene el producto con mayor precio
                .ifPresentOrElse(
                        System.out::println, // si existe
                        () -> System.out.println("No hay productos disponibles.")
                );
    }
    // 5. Calcular el precio promedio de todos los productos
    public void ejercicio5() {
        double promedio = productos.stream()
                .filter(p -> p.getPrecio() != null)           // evita NullPointerException
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(Double.NaN);                          // más semántico que 0.0 si no hay datos

        if (Double.isNaN(promedio)) {
            System.out.println("No hay productos con precio válido para calcular el promedio.");
        } else {
            System.out.printf("El precio promedio de los productos es: %.2f%n", promedio);
        }
    }
    //6.	Obtener las categorías y la sumatoria de las cantidades de productos
    public void ejercicio6() {
            Map<Integer, Integer> sumaPorCategoria = productos.stream()
                    .filter(p -> p.getCategoriaId() != null && p.getCantidadExistencia() != null) // evita nulos
                    .collect(Collectors.groupingBy(
                            Producto::getCategoriaId,                         // clave: ID de categoría
                            Collectors.summingInt(Producto::getCantidadExistencia) // valor: suma de cantidades
                    ));

            // Mostrar resultados
            sumaPorCategoria.forEach((categoriaId, sumaCantidad) ->
                    System.out.printf("Categoría ID: %d → Suma de Cantidad: %d%n", categoriaId, sumaCantidad)
            );
        }

    public static void main(String[] args) {
        EjemploStreamProductos ejemplo = new EjemploStreamProductos();
        ejemplo.ejercicio6();
    }
}
