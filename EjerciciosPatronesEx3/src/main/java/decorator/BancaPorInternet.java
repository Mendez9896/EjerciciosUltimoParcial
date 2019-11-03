package decorator;

public class BancaPorInternet extends Decorator {

	private boolean activado = false;
	public BancaPorInternet(Cuenta component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void operation() {
		super.operation();
		this.setActivado(true);
		System.out.println("Su cuenta tiene el servicio por internet");
		
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

}
