package hazerta.com.modelo.poo;

public class Alumno {
    private double[] parciales;
    private String nombreCompleto;

    public void actualizarParcial(int numeroParcial, double calificacion) throws Exception {
        if (numeroParcial >= 0 && numeroParcial < parciales.length) {
            parciales[numeroParcial] = calificacion;
        }else{
//            throw new Exception("el indice " + numeroParcial + " fuera de rango");
            throw new Exception("fuerad de rango");
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : parciales) {
            suma += calificacion;
        }
        return suma / parciales.length;
    }

    public String mostrarCalificaciones() {
        String texto="";
        for (int i = 0; i < parciales.length; i++) {
            texto+="Parcial nº" + (i + 1) + ": " + parciales[i]+" ";
        }
        return texto;
    }
    public Alumno(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[cantidadParciales];
    }

    public double[] getParciales() {
        return parciales;
    }

    public void setParciales(double[] parciales) {
        this.parciales = parciales;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
