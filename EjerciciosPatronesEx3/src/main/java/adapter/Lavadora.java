package adapter;

public class Lavadora implements IArtefactosElectronicos2 {

	private int costo;
	private int tiempoDeGarantia;
	
	public Lavadora(int costo, int tiempo) {
		this.costo = costo;
		this.tiempoDeGarantia = tiempo;
	}
	
	@Override
	public int costo() {
		return costo;
	}

	@Override
	public int tiempoDeGarantia() {
		return tiempoDeGarantia;
	}

}
