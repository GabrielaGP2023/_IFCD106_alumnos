package hazerta.com.modelo.ejercicio1Conductor;



public class Conductor {

	private IVehiculo vehiculo;

	public String conducir() {
		return vehiculo.moverse();
	}

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor() {
    }
	

	public IVehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(IVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


}
