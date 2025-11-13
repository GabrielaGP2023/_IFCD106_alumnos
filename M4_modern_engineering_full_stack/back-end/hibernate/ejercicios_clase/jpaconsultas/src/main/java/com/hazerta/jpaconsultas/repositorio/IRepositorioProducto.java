package com.hazerta.jpaconsultas.repositorio;

import com.hazerta.jpaconsultas.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IRepositorioProducto extends JpaRepository<Producto,Integer> {
    List<Producto> findByNombre(String nombre);
    List<Producto> findByNombreContaining(String patron);
    List<Producto> findByIdCategoria(int idCategoria);

    @Query("select p from Producto p where p.nombre like %?1%")
    List<Producto> obtenerProductoPorPatron(String patron);

    @Query(value="select * from products where product_name like %?1%", nativeQuery = true)
    List<Producto> obtenerProductoPorPatronNativo(String patron);
}
