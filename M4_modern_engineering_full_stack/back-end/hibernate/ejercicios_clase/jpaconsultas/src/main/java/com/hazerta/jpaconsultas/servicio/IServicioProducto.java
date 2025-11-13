package com.hazerta.jpaconsultas.servicio;

import com.hazerta.jpaconsultas.modelo.Producto;

import java.util.List;

public interface IServicioProducto {
    List<Producto> listarProductos();
    Producto listarProductoPorId(int id);
    Producto guardarProducto(Producto producto);
    Producto actualizarProducto(Producto producto);
    void eliminarProducto(int id);
    List<Producto> listarProductosPorNombre(String nombre);
    List<Producto> listarProductosPorPatron(String patron);
    List<Producto> listarProductosPorIdCategoria(int idCategoria);
    List<Producto> listarProductoPorPatron(String patron);
    List<Producto> listarProductoPorPatronNativo(String patron);
}
