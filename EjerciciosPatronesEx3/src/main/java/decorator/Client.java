package decorator;

public class Client {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaBasica("Andres");
		
		cuenta.setMonto(100);
		
		cuenta = new BancaPorInternet(cuenta);

		cuenta = new Seguro(cuenta);
		
		cuenta = new Promocion(cuenta);
		
		cuenta.operation();

	}

}
