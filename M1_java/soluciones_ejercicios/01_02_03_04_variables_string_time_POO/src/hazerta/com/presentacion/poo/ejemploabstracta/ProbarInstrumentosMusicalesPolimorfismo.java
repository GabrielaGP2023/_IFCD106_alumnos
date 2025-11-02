package hazerta.com.presentacion.poo.ejemploabstracta;

import hazerta.com.modelo.ejemploabstracta.Bateria;
import hazerta.com.modelo.ejemploabstracta.Flauta;
import hazerta.com.modelo.ejemploabstracta.Guitarra;
import hazerta.com.modelo.ejemploabstracta.InstrumentoMusical;

import java.util.ArrayList;



public class ProbarInstrumentosMusicalesPolimorfismo {

	public static void main(String[] args) {
		// Declarar un array de Instrumentos Musicales

//		InstrumentoMusical i = new InstrumentoMusical(); Una clase abstracta no se puede instanciar

		Guitarra guido = new Guitarra("yamaha", "metalicas");
		desdeMain(guido);
		Bateria bataca = new Bateria("xxyy", 5);
		desdeMain(bataca);
		Flauta ham = new Flauta("yamaha", "pvc");
		desdeMain(ham);
        //aqui hay polimorfismo
        //No veo tipo de cuerda
        InstrumentoMusical prueba = new Guitarra();
        //Casting para ver tipo de cuerda

        if (prueba instanceof Guitarra){
            Guitarra f2 = (Guitarra) prueba;
        }
		
		ArrayList<InstrumentoMusical> a1 = new ArrayList<InstrumentoMusical>();
		a1.add(guido);
		a1.add(bataca);
		a1.add(ham);
		System.out.println("=".repeat(50));
		System.out.println("Bucle for");
		
		for (InstrumentoMusical elemento : a1) {
			System.out.println(elemento.sonidoEmitido());
		}
	}
	
	public static void desdeMain(InstrumentoMusical i) {
		System.out.println(i.sonidoEmitido());
	}

}
