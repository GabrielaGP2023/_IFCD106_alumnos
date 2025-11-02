package hazerta.com.modelo.ejercicio3Informes;

public class Secretario implements IEmpleado{
    private IInforme informe;
    private String empresa;
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
