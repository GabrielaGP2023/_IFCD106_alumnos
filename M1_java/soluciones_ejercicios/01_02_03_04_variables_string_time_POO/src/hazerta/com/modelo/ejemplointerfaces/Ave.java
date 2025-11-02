package hazerta.com.modelo.ejemplointerfaces;

public class Ave extends Animal implements ObjetoVolador{
    @Override
    public String volar() {
        return "El ave vuela ...";
    }

    @Override
    public String despegar() {
        return "El Ave despega ...";
    }

    @Override
    public String aterrizar() {
        return "El ave aterriza";
    }
}
