package hazerta.com.modelo.ejercicio2SeguroCoche;

public class Coche {

	private String matricula;
	private String modelo;
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", modelo=" + modelo + "]";
	}
	
	public Coche() {
		// TODO Auto-generated constructor stub
	}

	public Coche(String matricula, String modelo) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
