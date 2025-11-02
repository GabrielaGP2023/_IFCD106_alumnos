package com.hazerta.persistencia;


import com.hazerta.modelo.DetallePedidos;
import com.hazerta.modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoDetallesPedidos extends Conexion {

    public List<DetallePedidos> obtenerDetalles() throws SQLException, ClassNotFoundException {
        List<DetallePedidos> detalles = new ArrayList<>();
        String sql = "SELECT order_id, product_id, unit_price, quantity FROM order_details";
        Statement miStatement = null;
        ResultSet rejilla = null;

//  1. Abrir conexion
        abrirConexion();
//  2. Obtener el Statement
        miStatement = miConexion.createStatement();
//  3. Ejecutar la consulta
        rejilla = miStatement.executeQuery(sql);
//  4. Obtener los datos
        while (rejilla.next()) {
            int id = rejilla.getInt("order_id");
            int producto = rejilla.getInt("product_id");
            double precio = rejilla.getDouble("unit_price");
            int cantidad = rejilla.getInt("quantity");
            DetallePedidos d = new DetallePedidos(id, producto, precio, cantidad);
//                 Añadir el producto a la lista
            detalles.add(d);
        }

//  5. Devolver el array
        return detalles;


    }
}
