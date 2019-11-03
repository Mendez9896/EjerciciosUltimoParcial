package adapter;

public class Televisor implements IArtefactosElectronicos2 {

	private int costo;
	private int tiempoDeGarantia;
	
	public Televisor(int costo, int tiempo) {
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
