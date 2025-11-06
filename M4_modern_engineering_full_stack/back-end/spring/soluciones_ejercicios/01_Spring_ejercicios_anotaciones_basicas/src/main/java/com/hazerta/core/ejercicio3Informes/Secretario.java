package com.hazerta.core.ejercicio3Informes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
@Data
public class Secretario implements IEmpleado{
    @Autowired
    private IInforme informe;

    @Value("Tech Solutions")
    private String empresa;

    @Value("xx@gmail.com")
    private String email;

    @Override
    public String getTareas() {
        return "Atender llamadas y gestionar la agenda.";
    }

    @Override
    public String getInforme() {
        return "Informe del secretario: " + informe.getInforme();
    }
    public Secretario(IInforme informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getEmail() {
        return email;
    }
}
