package com.hazerta.core;


import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import com.hazerta.core.ejercicio2SeguroCoche.CocheA;
import com.hazerta.core.ejercicio2SeguroCoche.SeguroCoche;
import com.hazerta.core.ejercicio3Informes.IEmpleado;
import com.hazerta.core.ejercicio4DAO.AccesoProduccion;
import com.hazerta.core.ejercicio4DAO.Cliente;
import com.hazerta.core.ejercicio4DAO.ClienteDAO;
import com.hazerta.core.ejercicio5Factura.Factura;
import com.hazerta.core.ejercicio5Factura.Producto;
import com.hazerta.core.modelo.ejercicio1Conductor.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CoreApplication implements CommandLineRunner {
    //Ejercicio 1
    @Autowired
    private Conductor c1;
    //Ejercicio 2
    @Autowired
    private SeguroCoche s1;
    @Autowired
    private CocheA co1;
    //Ejercicio 3
    @Autowired
    @Qualifier("director")
    private IEmpleado director;
    @Autowired
    @Qualifier("jefe")
    private IEmpleado jefe;
    @Autowired
    @Qualifier("secretario")
    private IEmpleado secretario;
    //Ejercicio 4
    @Autowired
    private Cliente cliente;
    @Autowired
    private ClienteDAO clienteDAO;
    @Autowired
    private AccesoProduccion accesoProduccion;

    //Ejercicio 5
    @Autowired
    private Factura f1;


	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----- EJERCICIO 1 -----");
        System.out.println(c1.conducir());
        System.out.println("----- EJERCICIO 2 -----");
        System.out.println(s1.reparar(co1));
        System.out.println("----- EJERCICIO 3 -----");
        System.out.println(director.getTareas());
        System.out.println(director.getInforme());
        System.out.println(jefe.getTareas());
        System.out.println(jefe.getInforme());
        System.out.println(secretario.getTareas());
        System.out.println(secretario.getInforme());
        System.out.println("-----Ejercicio 4-----");
        System.out.println(clienteDAO.insertar(cliente));
        clienteDAO.setConexion(accesoProduccion);
        System.out.println(clienteDAO.insertar(cliente));
        System.out.println("-----Ejercicio 5-----");
        List<Producto> productos = List.of(new Producto("Producto 1", 100.0),
                                         new Producto("Producto 2", 200.0),
                                         new Producto("Producto 3", 300.0));
        f1.setProductos(productos);
        System.out.println("Total factura con impuestos: " + f1.calcularTotalFactura());

    }
}
