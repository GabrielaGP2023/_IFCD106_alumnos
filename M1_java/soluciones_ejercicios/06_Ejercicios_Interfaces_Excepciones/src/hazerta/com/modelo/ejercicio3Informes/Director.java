package hazerta.com.modelo.ejercicio3Informes;

public class Director implements IEmpleado {
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
