package com.hazerta.jpaconsultas;

import com.hazerta.jpaconsultas.servicio.IServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaconsultasApplication implements CommandLineRunner {
    @Autowired
    IServicioProducto servicioProducto;

	public static void main(String[] args) {
		SpringApplication.run(JpaconsultasApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Lista de productos:");
        servicioProducto.listarProductos().forEach(System.out::println);
        System.out.println("---Consulta personalizada por nombre 'Geitost'---");
        servicioProducto.listarProductosPorNombre("Geitost").forEach(System.out::println);
        System.out.println("---Consulta personalizada por patrón 'F'---");
        servicioProducto.listarProductosPorPatron("F").forEach(System.out::println);
        System.out.println("---Consulta personalizada por idCategoria 5---");
        servicioProducto.listarProductosPorIdCategoria(5).forEach(System.out::println);
        System.out.println("---Consulta personalizada por patrón 'C' con @Query---");
        servicioProducto.listarProductoPorPatron("C").forEach(System.out::println);
        System.out.println("---Consulta personalizada por patrón 'F' con @Query nativa---");
        servicioProducto.listarProductoPorPatronNativo("F").forEach(System.out::println);
    }
}
