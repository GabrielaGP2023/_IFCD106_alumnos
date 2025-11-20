package com.hazerta.consultas.definicionbbdd.service;


import com.hazerta.consultas.definicionbbdd.secondary.entity.CiudadPais;
import com.hazerta.consultas.definicionbbdd.secondary.entity.Cliente;
import com.hazerta.consultas.definicionbbdd.secondary.repository.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicioImpl  implements IClienteServicio {
    @Autowired
    private IClienteRepositorio repositorio;


    @Override
    public List<Cliente> findByCiudad(String ciudad) {
        return repositorio.findByCiudad(ciudad);
    }

    @Override
    public List<CiudadPais> findDistinctCiudadByPais(String pais) {
        return repositorio.findCiudadDistinctByPais(pais);
    }

    @Override
    public List<Cliente> findByCiudadAndPais(String ciudad, String pais) {
        return repositorio.findByCiudadAndPais(ciudad,pais);
    }

    @Override
    public List<Cliente> findByOrderByNombreEmpresaDesc() {
        return repositorio.findByOrderByNombreEmpresaDesc();
    }

    @Override
    public List<Cliente> findByNombreEmpresaLike(String patron) {
        return repositorio.findFirst3ByNombreEmpresaLike(patron);
    }

    @Override
    public List<Cliente> findByPaisIn(List<String> paises) {
        return repositorio.findByPaisIn(paises);
    }

    @Override
    public Page<Cliente> consultaPaginada(Pageable p) {
        return repositorio.findAll(p);
    }

    @Override
    public List<Cliente> consultaPorPais(String pais) {
        return repositorio.consultaPorPais(pais);
    }

    @Override
    public List<Cliente> consultaPorPaisParametroNombre(String pais) {
        return repositorio.consultaPorPaisParametroNombre(pais);
    }

    @Override
    public List<Cliente> consultaPorPaisNativa(String pais) {
        return repositorio.consultaPorPaisNativa(pais);
    }

    @Override
    public List<Cliente> consultaPorPaisOrdenar(String pais, String atributo) {
        return repositorio.consultaPorPaisOrdenar(pais, Sort.by(atributo));
    }

    @Override
    public List<CiudadPais> consultarDistintosPaisCiudad(String pais) {
        return repositorio.findCiudadDistinctByPais(pais);
    }
}
