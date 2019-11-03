package bridge;

public class Euros implements Moneda {

	private double cambio = 7.72;
	
	@Override
	public double getMonto(double monto) {
		return monto * cambio;
	}

}
