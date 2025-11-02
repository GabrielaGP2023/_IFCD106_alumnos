package hazerta.com.presentacion;

import hazerta.com.modelo.ejercicio4DAO.AccesoDesarrollo;
import hazerta.com.modelo.ejercicio4DAO.AccesoProduccion;
import hazerta.com.modelo.ejercicio4DAO.Cliente;
import hazerta.com.modelo.ejercicio4DAO.ClienteDAO;

public class ProbarDAOE4 {


    public static void main(String[] args) {


        Cliente c2 = new Cliente("Juan Lopez", "12345678A");

        AccesoProduccion produccion = new AccesoProduccion();
        AccesoDesarrollo desarrollo = new AccesoDesarrollo();
        ClienteDAO cDAO1 = new ClienteDAO(produccion);
        System.out.println(cDAO1.insertar(c2));
        cDAO1.setConexion(desarrollo);
        System.out.println(cDAO1.insertar(c2));
    }


}
