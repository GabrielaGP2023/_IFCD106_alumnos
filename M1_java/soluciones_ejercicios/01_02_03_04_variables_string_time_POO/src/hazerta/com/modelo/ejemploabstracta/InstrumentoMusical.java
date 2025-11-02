package hazerta.com.modelo.ejemploabstracta;

public abstract class InstrumentoMusical {
	
	//1. Atributos
	protected String marca;
	//2. M�todos
	public abstract String sonidoEmitido();
		
	
	//3. Constructores
	public InstrumentoMusical() {	
	}
	
	public InstrumentoMusical(String marca) {
		this.marca = marca;
	}

	//4. Setters y Getters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
