package bridge;

public class Bolivianos implements Moneda {

	private double cambio = 1;
	
	@Override
	public double getMonto(double monto) {
		return monto * cambio;
	}

}
