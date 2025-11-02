package hazerta.com.modelo.ejercicio5Factura;

public class IvaGeneral implements IImpuesto{
    public static double IVA = 0.21;
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*IVA;
    }
}
