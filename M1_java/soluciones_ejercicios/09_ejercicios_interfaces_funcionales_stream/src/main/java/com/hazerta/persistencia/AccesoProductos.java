package com.hazerta.persistencia;



import com.hazerta.modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoProductos extends Conexion{

    public List<Producto> obtenerProductos() throws SQLException, ClassNotFoundException {
        List <Producto> productos = new ArrayList<>();

//  1. Abrir conexion
       abrirConexion();
//  2. Obtener el Statement
         Statement miStatement = miConexion.createStatement();
//  3. Ejecutar la consulta

            String sql = "SELECT Product_id, Product_name, category_id, unit_price, units_in_stock FROM Products";
            ResultSet rejilla = miStatement.executeQuery(sql);


//  4. Obtener los datos
            while (rejilla.next()) {
                int id = rejilla.getInt("product_id");
                String nombre = rejilla.getString("product_name");
                int categoriaId = rejilla.getInt("category_id");
                double precio = rejilla.getDouble("unit_price");
                int cantidadExistencia = rejilla.getInt("units_in_stock");
                Producto p = new Producto(id, nombre, categoriaId, precio, cantidadExistencia);
//                 Añadir el producto a la lista
                 productos.add(p);
            }
       miStatement.close();
            rejilla.close();
           miConexion.close();
//  5. Devolver el array
        return    productos;



    }
}
