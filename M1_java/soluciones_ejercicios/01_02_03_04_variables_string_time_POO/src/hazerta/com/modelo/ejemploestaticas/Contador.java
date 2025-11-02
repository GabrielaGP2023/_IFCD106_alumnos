package hazerta.com.modelo.ejemploestaticas;

public class Contador {
	
	//Atributo estático
	public static Integer contadorGlobal=0;
	
	//Atributo de instancia
	private Integer numeroSerie = ++contadorGlobal;
	
	

	@Override
	public String toString() {
		return "Contador [numeroSerie=" + numeroSerie + "]";
	}

	public static int getContadorGlobal() {
		return contadorGlobal;
	}

	public static void setContadorGlobal(int contadorGlobal) {
		Contador.contadorGlobal = contadorGlobal;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	

}
