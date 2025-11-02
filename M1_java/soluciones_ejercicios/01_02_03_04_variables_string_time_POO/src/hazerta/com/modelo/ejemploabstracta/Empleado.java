package hazerta.com.modelo.ejemploabstracta;

import java.time.LocalDate;

public abstract class Empleado {
    //Atributos
     private String dni;
     private String nombre;
     private LocalDate fNacimiento;
     private LocalDate fIngreso;
     protected double sueldo;
  //Métodos
     public abstract double calcularNomina();



    public Empleado() {
    }

    public Empleado(String dni, String nombre, LocalDate fNacimiento, LocalDate fIngreso, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.fIngreso = fIngreso;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fNacimiento=" + fNacimiento +
                ", fIngreso=" + fIngreso +
                ", sueldo=" + sueldo +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public LocalDate getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(LocalDate fIngreso) {
        this.fIngreso = fIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
