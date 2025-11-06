package com.hazerta.core.ejercicio3Informes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director implements IEmpleado {
    @Autowired
    private IInforme informe;

    @Override
    public String getTareas() {
        return "Planificar la estrategia global de la empresa.";
    }

    @Override
    public String getInforme() {
        return "Informe presentado por el director: " + informe.getInforme();
    }
    public Director(IInforme informe) {
        this.informe = informe;
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }

}
