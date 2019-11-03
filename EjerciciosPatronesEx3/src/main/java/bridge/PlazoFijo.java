package bridge;

public class PlazoFijo implements Cuenta {

	private double interes = 1.05;
	private int monto;
	private Moneda moneda;
	public PlazoFijo(Moneda moneda) {
		this.moneda = moneda;
	}
	
	@Override
	public void depositar(int monto) {
		this.monto += monto;
	}

	@Override
	public void retirar(int monto) {
		if(this.monto >= monto) {
			this.monto -= monto;
		}else {
			System.out.println("Su cuenta no tiene este monto de dinero");
		}

	}

	@Override
	public void getMonto() {
		System.out.println("Su saldo es de: " + (moneda.getMonto(monto) * interes) + " bs");

	}

}
