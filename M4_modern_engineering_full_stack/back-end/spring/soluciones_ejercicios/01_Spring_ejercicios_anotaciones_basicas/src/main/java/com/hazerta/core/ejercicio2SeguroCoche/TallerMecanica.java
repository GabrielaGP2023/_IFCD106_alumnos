package com.hazerta.core.ejercicio2SeguroCoche;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class TallerMecanica implements ITaller {


    @Override
    public String reparar(CocheA c) {
        return "El coche con la matricula " + c.getMatricula() + " se esta reparando en el sistema mecánico";
    }
}
