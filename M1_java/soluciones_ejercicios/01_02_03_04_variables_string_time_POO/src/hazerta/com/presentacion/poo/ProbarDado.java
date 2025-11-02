package hazerta.com.presentacion.poo;

import com.softtek.modelo.Dado;

import java.util.Scanner;

public class ProbarDado {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Scanner sc = new Scanner(System.in);
        String respuesta = "s";
        do {
            System.out.println(dado.lanzar());
            System.out.println("¿Quieres continuar?");
            respuesta=sc.nextLine();
        }while(respuesta.equals("s"));
    }
}
