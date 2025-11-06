package com.hazerta.core.ejercicio4DAO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
	@Value("Juan Perez")
	private String nombre;
    @Value("12345678A")
	private String nif;

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", Nif='" + nif + '\'' +
                '}';
    }

    public Cliente() {
	// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String nif) {
	super();
	this.nombre = nombre;
	this.nif = nif;
	}

	public String getNombre() {
	return nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public String getNif() {
	return nif;
	}

	public void setNif(String nif) {
	this.nif = nif;
	}


}
