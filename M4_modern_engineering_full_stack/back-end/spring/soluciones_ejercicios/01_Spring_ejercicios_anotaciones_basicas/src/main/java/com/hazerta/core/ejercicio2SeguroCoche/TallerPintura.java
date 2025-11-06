package com.hazerta.core.ejercicio2SeguroCoche;


import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements ITaller {

	@Override
	public String reparar(CocheA c) {
		// TODO Auto-generated method stub
		return "El coche con la matricula " + c.getMatricula() + " se está pintando";
	}

}
