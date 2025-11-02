package hazerta.com.presentacion.poo;


import hazerta.com.modelo.poo.Alumno;

public class ProbarAlumno {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan López", 3);
        try{
            alumno.actualizarParcial(0, 8.5);
            alumno.actualizarParcial(1, 7.0);
            alumno.actualizarParcial(5, 9.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(("Nombre del alumno: "+alumno.getNombreCompleto()+"\n"));
        System.out.println(alumno.mostrarCalificaciones());
        System.out.println("Promedio: " + alumno.calcularPromedio());
    }
}
