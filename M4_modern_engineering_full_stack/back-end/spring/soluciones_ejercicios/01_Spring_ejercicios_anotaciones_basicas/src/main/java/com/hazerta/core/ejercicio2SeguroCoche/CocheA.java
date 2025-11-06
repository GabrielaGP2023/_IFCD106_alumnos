package com.hazerta.core.ejercicio2SeguroCoche;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class CocheA {
    @Value("1234-ABC")
	private String matricula;
    @Value("Toyota Corolla")
	private String modelo;
	

	

	
}
