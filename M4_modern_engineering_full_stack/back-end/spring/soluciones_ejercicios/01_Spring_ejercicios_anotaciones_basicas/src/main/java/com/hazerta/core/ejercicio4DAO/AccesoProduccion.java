package com.hazerta.core.ejercicio4DAO;

import org.springframework.stereotype.Component;

@Component
public class AccesoProduccion implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "En PRODUCCION se ha dado de alta el cliente "+ c.getNif();
	}

}
