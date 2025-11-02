package hazerta.com.modelo.ejercicio4DAO;


public class AccesoDesarrollo implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "En DESARROLLO se está dando de alta el cliente " + c.getNif();
	}

}
