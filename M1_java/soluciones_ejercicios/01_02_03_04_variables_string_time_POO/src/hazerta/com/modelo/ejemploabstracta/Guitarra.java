package hazerta.com.modelo.ejemploabstracta;

public class Guitarra extends InstrumentoMusical {
	
	//1. Atributos
	private String tipoCuerdas;
	//2. M�todos
	@Override
	public String sonidoEmitido() {
		// TODO Auto-generated method stub
		return "gli, gli, gli";
	}
	//3. Construcciones
	public Guitarra() {
		// TODO Auto-generated constructor stub
	}
	public Guitarra(String marca) {
		super(marca);
	}
	
	public Guitarra(String marca, String tipoCuerdas) {
		super(marca);
		this.tipoCuerdas = tipoCuerdas;
	}
	//4. Setters y Getters
	public String getTipoCuerdas() {
		return tipoCuerdas;
		
	}
	public void setTipoCuerdas(String tipoCuerdas) {
		this.tipoCuerdas = tipoCuerdas;
	}
	
	

}
