package hazerta.com.modelo.ejercicio1Conductor;




public class Coche implements IVehiculo {
	
    private int deposito;

	@Override
	public String moverse() {
		// TODO Auto-generated method stub
        if (deposito > 1) {
            return "El coche se está moviendo";
        }else{
            return "El coche No tiene gasolina";
        }

	}

    public Coche() {
    }

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
