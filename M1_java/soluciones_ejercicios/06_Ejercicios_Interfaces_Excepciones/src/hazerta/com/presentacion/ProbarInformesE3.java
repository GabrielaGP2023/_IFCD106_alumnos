package hazerta.com.presentacion;

import hazerta.com.modelo.ejercicio3Informes.*;

public class ProbarInformesE3 {
    public static void main(String[] args) {
        IInforme informe1 = new InformeTrimestre1();
        IInforme informe2 = new InformeTrimestre2();

        IEmpleado jefe = new Jefe(informe1);
        IEmpleado director = new Director(informe2);
        IEmpleado secretario = new Secretario(informe1, "Cicpa S.A.", "secretario@cicpa.com");


        IEmpleado[] empleados = new IEmpleado[] { jefe, director, secretario };

        for (IEmpleado empleado : empleados) {
            System.out.println(empleado.getTareas());
            System.out.println(empleado.getInforme());
            System.out.println();
        }

    }
}
