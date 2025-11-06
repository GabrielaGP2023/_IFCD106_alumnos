package com.hazerta.core.ejercicio3Informes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InformeTrimestre2 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe correspondiente al segundo trimestre.";
    }
}
