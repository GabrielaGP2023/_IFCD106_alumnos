package com.hazerta.consultas.definicionbbdd;

import com.hazerta.consultas.definicionbbdd.service.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private IClienteServicio clienteServicio;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---Solucion Ejercicios ---");
        System.out.println("---Ejercicio 1 ----");
        clienteServicio.findByCiudad("Madrid")
                .forEach(System.out::println);
        System.out.println("---Ejercicio 2 ----");
        clienteServicio.findByCiudadAndPais("Madrid","Spain")
                .forEach(System.out::println);
        System.out.println("---Ejercicio 3 ----");
        clienteServicio.findByNombreEmpresaLike("C%")
                .forEach(System.out::println);
        System.out.println("---Ejercicio 4 ----");
        clienteServicio.consultarDistintosPaisCiudad("Spain")
                .forEach(System.out::println);
        System.out.println("---Ejercicio 5 ----");
        clienteServicio.findByOrderByNombreEmpresaDesc()
                .forEach(System.out::println);
        System.out.println("---Ejercicio 6 ----");
        List<String> paises = List.of("Spain", "Mexico");
        clienteServicio.findByPaisIn(paises)
                .forEach(System.out::println);
        System.out.println("---Ejercicio 7 ----");
        clienteServicio.consultaPorPaisNativa("Spain")
                .forEach(System.out::println);



    }
}
