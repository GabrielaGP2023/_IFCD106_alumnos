package com.softtek.modelo;

import java.util.Random;

public class Dado {
    private int numeroAleatorio;
    private Random numeroGenerado = new Random();

    public String lanzar() {
        numeroAleatorio = numeroGenerado.nextInt(6) + 1;
        String resultado = "";
        switch (numeroAleatorio){
            case 1 : resultado =numero1();
                    break;
            case 2 : resultado =numero2();
                    break;
            case 3 : resultado =numero3();
                    break;
            case 4 : resultado =numero4();
                    break;
            case 5 : resultado =numero5();
                    break;
            case 6 : resultado =numero6();
                break;
        }
        return resultado;
    }
    public String numero1(){
        return "     \n  *  \n     ";
    }
    public String numero2(){
        return "*    \n     \n     *";
    }
    public String numero3(){
        return "*    \n  *  \n    *";
    }
    public String numero4(){
        return "*   *\n     \n*   *";
    }
    public String numero5(){
        return "*   *\n  *  \n*   *";
    }
    public String numero6(){
        return "* * *\n* * *\n* * *";
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }
    public Dado() {
    }

}
