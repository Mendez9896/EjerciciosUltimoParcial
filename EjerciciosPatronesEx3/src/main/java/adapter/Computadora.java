package adapter;

public class Computadora implements IArtefactosElectronicos1 {

	private int precio;
	private int tiempoDeVida;
	
	public Computadora(int precio, int tiempo) {
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
