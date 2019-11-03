package adapter;

public class Client {

	public static void main(String[] args) {
		Televisor tv = new Televisor(100, 2);
		Lavadora lavadora = new Lavadora(200, 6);
		Refrigerador refrigerador = new Refrigerador(500, 6);
		
		ConcreteAdapater concreteAdapaterTV = new ConcreteAdapater(tv);
		ConcreteAdapater concreteAdapaterLavadora = new ConcreteAdapater(lavadora);
		ConcreteAdapater concreteAdapaterRefrigerador = new ConcreteAdapater(refrigerador);
		
		System.out.println("Costo tv: " + concreteAdapaterTV.precio() + " Tiempo de vida: " + concreteAdapaterTV.tiempoDeVida());

		System.out.println("Costo lavadora: " + concreteAdapaterLavadora.precio() + " Tiempo de vida: " + concreteAdapaterLavadora.tiempoDeVida());

		System.out.println("Costo refri: " + concreteAdapaterRefrigerador.precio() + " Tiempo de vida: " + concreteAdapaterRefrigerador.tiempoDeVida());
		

	}

}
