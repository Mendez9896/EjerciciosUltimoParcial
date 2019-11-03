package decorator;

public class CuentaBasica implements Cuenta {

	private int monto;
	private String nombrePropietario;
	
	public CuentaBasica(String nombrePropietario) {
		this.setNombrePropietario(nombrePropietario);
	}
	
	
	@Override
	public void operation() {
		System.out.println("Operation Component concrete");

	}


	@Override
	public int getMonto() {
	
		return monto;
	}


	@Override
	public void setMonto(int monto) {
		this.monto = monto;
		
	}


	@Override
	public String getNombrePropietario() {

		return nombrePropietario;
	}


	@Override
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
		
	}




}
