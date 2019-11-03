package visitor;

public class Caballo implements IAnimal {
	
	public int enfermedad;

	@Override
	public double visitarVet(IVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public int getEnfermedad() {
		
		return enfermedad;
	}

	@Override
	public void setEnfermedad(int enfermedad) {
		this.enfermedad = enfermedad;
		
	}
	
	
}
