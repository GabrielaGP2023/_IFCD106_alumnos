package hazerta.com.modelo.ejemploabstracta;

import java.time.LocalDate;

public class Gerente extends Empleado {
    //Atributos
    private double bono;
    private String responsabilidad;
    private boolean coche;
    private int numTrabajadores;
    //Metodos
    @Override
    public double calcularNomina() {
        return sueldo+bono*0.85;
    }
    //Constructores

    public Gerente() {
    }

    public Gerente(String dni, String nombre, LocalDate fNacimiento, LocalDate fIngreso, double sueldo, double bono, String responsabilidad, boolean coche, int numTrabajadores) {
        super(dni, nombre, fNacimiento, fIngreso, sueldo);
        this.bono = bono;
        this.responsabilidad = responsabilidad;
        this.coche = coche;
        this.numTrabajadores = numTrabajadores;
    }

    //Setters y Getters

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public boolean isCoche() {
        return coche;
    }

    public void setCoche(boolean coche) {
        this.coche = coche;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }
}
