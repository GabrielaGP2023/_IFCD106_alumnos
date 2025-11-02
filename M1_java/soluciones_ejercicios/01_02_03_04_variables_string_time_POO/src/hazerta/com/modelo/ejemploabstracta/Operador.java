package hazerta.com.modelo.ejemploabstracta;

import java.time.LocalDate;

public class Operador extends Empleado{
    private int numPieza;
    private double montoPieza;
    @Override
    public double calcularNomina() {
        return ((numPieza*montoPieza)+ sueldo)*.85;
    }

    public Operador() {
    }

    public Operador(String dni, String nombre, LocalDate fNacimiento, LocalDate fIngreso, double sueldo, int numPieza, double montoPieza) {
        super(dni, nombre, fNacimiento, fIngreso, sueldo);
        this.numPieza = numPieza;
        this.montoPieza = montoPieza;
    }

    public int getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(int numPieza) {
        this.numPieza = numPieza;
    }

    public double getMontoPieza() {
        return montoPieza;
    }

    public void setMontoPieza(double montoPieza) {
        this.montoPieza = montoPieza;
    }
}
