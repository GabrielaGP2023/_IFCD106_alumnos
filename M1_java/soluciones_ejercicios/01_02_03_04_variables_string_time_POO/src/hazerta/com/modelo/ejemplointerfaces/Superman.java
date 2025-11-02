package hazerta.com.modelo.ejemplointerfaces;

public class Superman implements ObjetoVolador{
    @Override
    public String volar() {
        return "Superman vuela";
    }

    @Override
    public String despegar() {
        return "Superman despega";
    }

    @Override
    public String aterrizar() {
        return "Superman aterrizar";
    }
}
