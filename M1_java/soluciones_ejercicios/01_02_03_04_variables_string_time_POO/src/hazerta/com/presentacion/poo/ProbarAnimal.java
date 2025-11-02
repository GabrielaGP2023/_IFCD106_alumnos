package hazerta.com.presentacion.poo;

import hazerta.com.modelo.poo.Animal;

public class ProbarAnimal {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.mamifero = true;
        perro.numPatas = 4;
        perro.nombre = "Fifi";
        System.out.println(perro.comer());
        System.out.println(perro.dormir());
        System.out.println(perro.mostrarInformacion());

        System.out.println("--------------------------------------------");

        Animal pez = new Animal();
        pez.mamifero = false;
        pez.numPatas = 0;
        pez.nombre = "Nemo";
        System.out.println(pez.comer());
        System.out.println(pez.dormir());
        System.out.println(pez.mostrarInformacion());

        System.out.println("--------------------------------------------");

        Animal cocodrilo = new Animal();
        cocodrilo.mamifero = false;
        cocodrilo.numPatas = 4;
        cocodrilo.nombre = "Dundee";
        System.out.println(cocodrilo.comer());
        System.out.println(cocodrilo.dormir());
        System.out.println(cocodrilo.mostrarInformacion());
    }
}
