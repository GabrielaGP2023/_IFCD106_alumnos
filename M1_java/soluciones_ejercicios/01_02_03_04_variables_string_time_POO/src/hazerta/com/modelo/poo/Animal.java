package hazerta.com.modelo.poo;

public class Animal {
    public boolean mamifero;
    public int numPatas;
    public String nombre;

    public String dormir() {
        return "El animal está durmiendo";
    }

    public String comer() {
        return "El animal está comiendo";
    }

    public String mostrarInformacion() {
        return "Mamífero: " + mamifero +
                " | Número de patas: " + numPatas +
                " | Nombre: " + nombre;
    }
}
