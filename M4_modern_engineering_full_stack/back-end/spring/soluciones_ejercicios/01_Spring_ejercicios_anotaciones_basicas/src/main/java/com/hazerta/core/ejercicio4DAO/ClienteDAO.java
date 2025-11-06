package com.hazerta.core.ejercicio4DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {

    @Autowired
    @Qualifier("accesoDesarrollo")
	private IDAO conexion;

	public String insertar(Cliente c) {
		return conexion.insertar(c);
	}

	public ClienteDAO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDAO(IDAO conexion) {
		super();
		this.conexion = conexion;
	}

	public IDAO getConexion() {
		return conexion;
	}

	public void setConexion(IDAO conexion) {
		this.conexion = conexion;
	}

}
