package hazerta.com.modelo.ejercicio5Factura;

public class IvaSuperReducido implements IImpuesto{
    public static double IVA_REDUCIDO = 0.04;
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*IVA_REDUCIDO;
    }
}
