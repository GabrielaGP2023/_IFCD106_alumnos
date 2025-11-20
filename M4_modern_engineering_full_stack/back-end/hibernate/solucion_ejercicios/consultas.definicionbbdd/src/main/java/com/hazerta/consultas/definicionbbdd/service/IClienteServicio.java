package com.hazerta.consultas.definicionbbdd.service;


import com.hazerta.consultas.definicionbbdd.secondary.entity.CiudadPais;
import com.hazerta.consultas.definicionbbdd.secondary.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IClienteServicio {
    List<Cliente> findByCiudad(String ciudad);

    List<CiudadPais> findDistinctCiudadByPais(String pais);

    List<Cliente> findByCiudadAndPais(String ciudad, String pais);

    List<Cliente> findByOrderByNombreEmpresaDesc();

    List<Cliente> findByNombreEmpresaLike(String patron);

    List<Cliente> findByPaisIn(List<String> paises);

    Page<Cliente> consultaPaginada(Pageable p);

    List<Cliente> consultaPorPais(String pais);

    List<Cliente> consultaPorPaisParametroNombre(String pais);

    List<Cliente> consultaPorPaisNativa(String pais);

    List<Cliente> consultaPorPaisOrdenar(String pais, String atributo);

    List<CiudadPais> consultarDistintosPaisCiudad(String pais);


}
