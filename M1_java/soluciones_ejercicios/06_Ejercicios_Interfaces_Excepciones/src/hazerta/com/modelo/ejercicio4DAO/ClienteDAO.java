package hazerta.com.modelo.ejercicio4DAO;


public class ClienteDAO {

	private IDAO conexion;

	public String insertar(Cliente c) {
		return conexion.insertar(c);
	}

	public ClienteDAO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDAO(IDAO conexion) {
		super();
		this.conexion = conexion;
	}

	public IDAO getConexion() {
		return conexion;
	}

	public void setConexion(IDAO conexion) {
		this.conexion = conexion;
	}

}
