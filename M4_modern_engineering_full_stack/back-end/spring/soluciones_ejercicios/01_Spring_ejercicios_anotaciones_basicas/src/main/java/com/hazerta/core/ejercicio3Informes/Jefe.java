package com.hazerta.core.ejercicio3Informes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jefe implements IEmpleado{

    @Autowired
    private IInforme informe;

    @Override
    public String getTareas() {
        return "Gestionar el departamento y supervisar al personal.";
    }

    @Override
    public String getInforme() {
        return "Informe presentado por el jefe: " + informe.getInforme();
    }
    public Jefe() {
    }

    public Jefe(IInforme informe) {
        this.informe = informe;
    }


}
