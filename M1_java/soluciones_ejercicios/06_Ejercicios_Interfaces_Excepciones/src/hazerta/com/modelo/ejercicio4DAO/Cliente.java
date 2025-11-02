package hazerta.com.modelo.ejercicio4DAO;

public class Cliente {
	
	private String nombre;
	private String nif;

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", Nif='" + nif + '\'' +
                '}';
    }

    public Cliente() {
	// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String nif) {
	super();
	this.nombre = nombre;
	this.nif = nif;
	}

	public String getNombre() {
	return nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public String getNif() {
	return nif;
	}

	public void setNif(String nif) {
	this.nif = nif;
	}


}
