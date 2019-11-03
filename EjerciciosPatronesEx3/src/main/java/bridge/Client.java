package bridge;

public class Client {

	public static void main(String[] args) {
		Bolivianos bol = new Bolivianos();
		Dolares dolares = new Dolares();
		Euros euros = new Euros();
		
		Ahorro ahorro = new Ahorro(bol);
		Credito credito = new Credito(euros);
		PlazoFijo plazoFijo = new PlazoFijo(dolares);
		
		ahorro.depositar(100);
		credito.depositar(100);
		plazoFijo.depositar(100);
		
		ahorro.getMonto();
		credito.getMonto();
		plazoFijo.getMonto();

	}

}
