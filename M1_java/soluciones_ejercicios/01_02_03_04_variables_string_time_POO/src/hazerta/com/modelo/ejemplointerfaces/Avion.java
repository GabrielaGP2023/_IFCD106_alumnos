package hazerta.com.modelo.ejemplointerfaces;

public class Avion extends Vehiculo implements ObjetoVolador{
    @Override
    public String volar() {
        return "El avión está volando ...";
    }

    @Override
    public String despegar() {
        return "El avión está despegando";
    }

    @Override
    public String aterrizar() {
        return "El avión esta aterrizando";
    }
}
