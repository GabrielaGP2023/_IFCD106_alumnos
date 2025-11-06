package com.hazerta.core.ejercicio3Informes;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre1 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe correspondiente al primer trimestre.";
    }
}
