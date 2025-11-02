package com.hazerta.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection miConexion;
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        // Lógica para abrir la conexión a la base de datos
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5433/Northwind";
        miConexion = DriverManager.getConnection(url, "postgres", "postgres");
        System.out.println("Conexión abierta exitosamente.");
    }
}
