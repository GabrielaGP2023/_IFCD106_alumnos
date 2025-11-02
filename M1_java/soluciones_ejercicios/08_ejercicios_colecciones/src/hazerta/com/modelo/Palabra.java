package hazerta.com.modelo;

import java.util.List;

public class Palabra {
    private String termino;
    private List<String> definiciones;


    @Override
    public String toString() {
        return "Palabra{" +
                "termino='" + termino + '\'' +
                ", definiciones=" + definiciones +
                '}';
    }

    public Palabra() {
    }

    public Palabra(String termino, List<String> definiciones) {
        this.termino = termino;
        this.definiciones = definiciones;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public List<String> getDefiniciones() {
        return definiciones;
    }

    public void setDefiniciones(List<String> definiciones) {
        this.definiciones = definiciones;
    }
}
