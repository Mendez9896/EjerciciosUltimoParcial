package visitor;

public interface IAnimal {

	
	public double visitarVet(IVisitor visitor);
	public int getEnfermedad();
	public void setEnfermedad(int enfermedad);
	
}
