package composite;

public abstract class Component {

	private int precio;
	private String name;
	public Component(String name) {
		this.name = name;
		System.out.println("Constructor " + name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void operation();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);

	public int getEstimacion() {
		return precio;
	}

	public void setPrecio(int estimacion) {
		this.precio = estimacion;
	}
	
	
	
}
