package hazerta.com.modelo.Ejercicio6Excepciones;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public void comprobar() throws ProductoException {

        if(id == 0){
           throw new ProductoException();
        }

    }
    public Producto() {
    }

    public Producto(int id, String nombre, double precio, String proveedor, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }


}
