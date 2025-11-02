package hazerta.com.modelo.ejercicio2SeguroCoche;



public class TallerMecanica implements ITaller {


    @Override
    public String reparar(Coche c) {
        return "El coche con la matricula " + c.getMatricula() + " se esta reparando en el sistema mecánico";
    }
}
