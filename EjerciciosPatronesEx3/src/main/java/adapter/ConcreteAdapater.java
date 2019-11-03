package adapter;

public class ConcreteAdapater implements IArtefactosElectronicos1 {
	private IArtefactosElectronicos2 artefacto;
	
	public ConcreteAdapater(IArtefactosElectronicos2 artefacto) {
		this.artefacto = artefacto;
	}

	@Override
	public int precio() {

		return artefacto.costo();
	}

	@Override
	public int tiempoDeVida() {
		// TODO Auto-generated method stub
		return artefacto.tiempoDeGarantia();
	}

}
