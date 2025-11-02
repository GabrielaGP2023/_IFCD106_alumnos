package hazerta.com.modelo.Ejercicio6Excepciones;

public class ProductoException extends Exception{
    public ProductoException(){
        super("No tiene un ID");
    }
}
