package hazerta.com.modelo.ejemploabstracta;

public class Bateria extends InstrumentoMusical {
	
	//1. Atributos
	private int nPlatos;
	//2. M�todo
	@Override
	public String sonidoEmitido() {
		return "Tran tran tran...";
	}
	//3. Constructores
	public Bateria() {
		// TODO Auto-generated constructor stub
		
	}
	public Bateria(String marca) {
		super(marca);
	}
	
	public Bateria(String marca, int nPlatos) {
		super(marca);
		this.nPlatos = nPlatos;
	}
	//4. Setters y getters
	public int getnPlatos() {
		return nPlatos;
	}
	public void setnPlatos(int nPlatos) {
		this.nPlatos = nPlatos;
	}
	

}
