package decorator;

public class Seguro extends Decorator {

	public Seguro(Cuenta component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void operation() {
		super.operation();
		this.getCuenta().setMonto(this.getCuenta().getMonto() - 10);
		System.out.println("Su cuenta tiene seguro, su saldo es: " + this.getCuenta().getMonto());
		
	}

}
