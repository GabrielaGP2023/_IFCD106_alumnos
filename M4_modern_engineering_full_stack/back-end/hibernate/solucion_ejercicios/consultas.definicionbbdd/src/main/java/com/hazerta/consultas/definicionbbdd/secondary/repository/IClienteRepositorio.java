package com.hazerta.consultas.definicionbbdd.secondary.repository;


import com.hazerta.consultas.definicionbbdd.secondary.entity.CiudadPais;
import com.hazerta.consultas.definicionbbdd.secondary.entity.Cliente;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IClienteRepositorio extends JpaRepository<Cliente, String> {
  //1.
  //Obtener todos los clientes de una ciudad concreta.
    List<Cliente> findByCiudad(String ciudad);

//    2.
//    Buscar clientes que pertenezcan simultáneamente a una ciudad y un país determinados.
    List<Cliente> findByCiudadAndPais(String ciudad, String pais);
//    3.
//    Recuperar los tres primeros clientes cuyo nombre de empresa coincida con un patrón dado mediante LIKE.
    List<Cliente> findFirst3ByNombreEmpresaLike(String patron);
//4.
//    Obtener todas las combinaciones distintas de ciudad para un país concreto, representadas en una proyección CiudadPais.
    List<CiudadPais> findCiudadDistinctByPais(String pais);
//    5.
//    Listar todos los clientes ordenados descendentemente por el nombre de la empresa.

    List<Cliente> findByOrderByNombreEmpresaDesc();
//6.
//    Consultar clientes cuyo país esté incluido dentro de una lista de países.
    List<Cliente> findByPaisIn(List<String> paises);
//  7.  Implementar diferentes formas de consultar clientes por país utilizando:
//    o
//    consulta JPQL con parámetro posicional,
//    o
//    consulta JPQL con parámetro con nombre,
//            o
//    consulta nativa mediante SQL,
//            o
//    consulta JPQL ordenable mediante un objeto Sort.
    @Query("select c from Cliente c where c.pais = ?1")
    List<Cliente> consultaPorPais(String pais);

    @Query("select c from Cliente c where c.pais = :pais")
    List<Cliente> consultaPorPaisParametroNombre(@Param("pais") String pais);

    @Query(value="select * from customers where country = :pais", nativeQuery = true)
    public List<Cliente> consultaPorPaisNativa(@Param("pais") String pais);

    @Query(value="select c from Cliente c where c.pais = :pais")
    List<Cliente> consultaPorPaisOrdenar(@Param("pais") String pais, Sort sort);


      List<Cliente> findDistinctCiudadByPais(String pais);
}
