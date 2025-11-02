package hazerta.com.modelo.poo;

public class Campos {
    private int x;



    public int muestra() {
        return x;
    }

    public void incrementa() {
        x++;
    }

    public Campos() {
    }
    public Campos(int valorInicial) {
        x = valorInicial;
    }
}
