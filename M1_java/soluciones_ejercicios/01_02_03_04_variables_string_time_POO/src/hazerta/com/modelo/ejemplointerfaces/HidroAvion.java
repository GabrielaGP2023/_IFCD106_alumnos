package hazerta.com.modelo.ejemplointerfaces;

public class HidroAvion extends Vehiculo implements ObjetoVolador, Nautico{
    @Override
    public String atracar() {
        return "HidroAvion atracando ...";
    }

    @Override
    public String navegar() {
        return "HidroAvion navegando ...";
    }

    @Override
    public String volar() {
        return "HidroAvion volando";
    }

    @Override
    public String despegar() {
        return "Hidroavion despegando";
    }

    @Override
    public String aterrizar() {
        return "Hidroavión aterrizando";
    }
}
