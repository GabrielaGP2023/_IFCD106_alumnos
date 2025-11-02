package hazerta.com.presentacion.poo.ejemploabstracta;

import hazerta.com.modelo.ejemploabstracta.Empleado;
import hazerta.com.modelo.ejemploabstracta.Gerente;
import hazerta.com.modelo.ejemploabstracta.Operador;
import hazerta.com.modelo.ejemploabstracta.Vendedor;

import java.time.LocalDate;

public class ProbarEjemploAbstracto {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("123456789A","Juan López", LocalDate.of(1992,8,30),LocalDate.of(2018,12,3),3_500,500,"Departamento Ventas",true,10);
        System.out.println("Calcular nomina ->"+ g1.calcularNomina());

        Vendedor v1 = new Vendedor("123456789B","Luis Bofill",LocalDate.of(1987,9,30),LocalDate.of(2000,1,1),2000,0.04f,100);
        System.out.println("Calcular nomina - >" + v1.calcularNomina());

        Operador o1 = new Operador("123456789C","Ana Flores",LocalDate.of(1999,01,01),LocalDate.of(2019,01,01),1_500,29,2);
        System.out.println("Calcular nomina -> "+ o1.calcularNomina());

    }
}
