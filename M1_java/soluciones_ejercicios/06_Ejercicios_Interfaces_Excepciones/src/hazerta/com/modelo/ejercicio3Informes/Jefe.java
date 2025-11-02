package hazerta.com.modelo.ejercicio3Informes;

public class Jefe implements IEmpleado{
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
