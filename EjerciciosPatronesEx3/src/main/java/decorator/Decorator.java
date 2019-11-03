package decorator;

public abstract class Decorator implements Cuenta {

	
	private Cuenta cuenta;
	public Decorator(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}

	
	@Override
	public void operation() {
		cuenta.operation();
		

	}
	

	@Override
	public int getMonto() {
	
		return cuenta.getMonto();
	}


	@Override
	public void setMonto(int monto) {
		cuenta.setMonto(monto);
		
	}


	@Override
	public String getNombrePropietario() {

		return cuenta.getNombrePropietario();
	}


	@Override
	public void setNombrePropietario(String nombrePropietario) {
		cuenta.setNombrePropietario(nombrePropietario);
		
	}

}
