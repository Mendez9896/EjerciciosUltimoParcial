package composite;

public class Computadora extends Component {

	
	public Computadora(String nombre) {
		super(nombre);
		this.setPrecio(100);
	}

	@Override
	public void operation() {
		System.out.println("Item: " + this.getName() + " Precio: " + this.getEstimacion());

	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Product");

	}

	@Override
	public void remove(Component component) {

		System.out.println("not applicable on Product");

	}

	@Override
	public void getChild(int position) {
		System.out.println("Item: " + this.getName());

	}

	

}
