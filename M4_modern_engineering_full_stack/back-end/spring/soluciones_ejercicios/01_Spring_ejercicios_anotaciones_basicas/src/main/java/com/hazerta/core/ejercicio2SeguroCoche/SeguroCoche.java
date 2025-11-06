package com.hazerta.core.ejercicio2SeguroCoche;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class SeguroCoche {
	//1. Atributos
    @Autowired
    @Qualifier("tallerMecanica")
	private ITaller taller;
    @Value("Mapfre")
	private String aseguradora;
	//2. Métodos
	public String reparar(CocheA c) {
		return taller.reparar(c);
	}

}
