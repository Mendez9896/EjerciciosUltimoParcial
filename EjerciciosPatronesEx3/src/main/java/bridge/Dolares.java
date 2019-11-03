package bridge;

public class Dolares implements Moneda {

	private double cambio = 6.96;
	
	@Override
	public double getMonto(double monto) {
		return monto * cambio;
	}

}
