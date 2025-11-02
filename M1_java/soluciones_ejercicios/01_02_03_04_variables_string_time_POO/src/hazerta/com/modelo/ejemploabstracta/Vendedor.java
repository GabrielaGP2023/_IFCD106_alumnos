package hazerta.com.modelo.ejemploabstracta;

import java.time.LocalDate;

public class Vendedor extends Empleado {
    private float comision;
    private double ventas;


    @Override
    public double calcularNomina() {
        return ((comision*ventas)+sueldo)* 0.85;
    }

    //Constructores

    public Vendedor() {
    }

    public Vendedor(String dni, String nombre, LocalDate fNacimiento, LocalDate fIngreso, double sueldo, float comision, double ventas) {
        super(dni, nombre, fNacimiento, fIngreso, sueldo);
        this.comision = comision;
        this.ventas = ventas;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
}
