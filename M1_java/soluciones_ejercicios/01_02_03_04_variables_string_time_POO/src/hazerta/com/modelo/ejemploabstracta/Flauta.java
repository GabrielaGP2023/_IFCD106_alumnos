package hazerta.com.modelo.ejemploabstracta;

public class Flauta extends InstrumentoMusical {
	
	//1. Atributo
	private String material;
	
	//2. M�todos
	@Override
	public String sonidoEmitido() {
		return "flu flu flu ...";
	}
    //3. Constructor
	public Flauta() {
		// TODO Auto-generated constructor stub
	}
	
	public Flauta(String marca) {
		super(marca);
	}
	
	public Flauta(String marca, String material) {
		super(marca);
		this.material = material;
	}
	//4. Setters y Getters

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}
