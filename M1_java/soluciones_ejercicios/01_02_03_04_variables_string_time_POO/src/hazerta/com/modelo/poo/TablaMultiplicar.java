package hazerta.com.modelo.poo;

public class TablaMultiplicar {
    private int numeroTabla; // Número de la tabla de multiplicar


    public String obtenerTabla() {
        String texto="";
        for (int i = 1; i <= 10; i++) {
            texto+=numeroTabla+" x "+i+" = "+(numeroTabla * i)+"\n";
        }
        return texto;
    }
    public String muestraTabla() {
        StringBuilder cadena = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            cadena.append(numeroTabla).append(" x ").append(i)
                    .append(" = ").append(numeroTabla * i).append("\n");
        }
        return cadena.toString();
    }

    public TablaMultiplicar(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public TablaMultiplicar() {
    }
}
