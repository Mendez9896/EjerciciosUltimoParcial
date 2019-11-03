package decorator;

public class Promocion extends Decorator {

	
	public Promocion(Cuenta component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void operation() {
		super.operation();
		if(Math.floor(Math.random()*2)% 2 == 0) {
			this.getCuenta().setMonto(this.getCuenta().getMonto()*2);
			System.out.print("Usted gano el sorteo ");
		}else {
			System.out.print("No gano el sorteo ");
		} 
		System.out.println("Su saldo es: " + this.getCuenta().getMonto());

		
	}
	
	
}
