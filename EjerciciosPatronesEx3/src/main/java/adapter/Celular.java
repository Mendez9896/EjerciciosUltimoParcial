package adapter;

public class Celular implements IArtefactosElectronicos1 {

	private int precio;
	private int tiempoDeVida;
	
	public Celular(int precio, int tiempo) {
		this.precio = precio;
		this.tiempoDeVida = tiempo;
	}
	
	@Override
	public int precio() {

		return precio;
	}

	@Override
	public int tiempoDeVida() {
		// TODO Auto-generated method stub
		return tiempoDeVida;
	}

}
