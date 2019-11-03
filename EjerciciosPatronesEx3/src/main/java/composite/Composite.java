package composite;

import java.util.ArrayList;

public class Composite extends Component {
	
	public Composite(String name) {
		super(name);
	}

	private ArrayList<Component> list = new ArrayList<Component>();

	@Override
	public void operation() {
		int esti = 0;
		for (Component comp: list) {
			comp.operation();
			esti += comp.getEstimacion();
		}
		
		this.setPrecio(esti);
		System.out.println("Item: " + this.getName() + " Precio: " + esti);

	}

	@Override
	public void add(Component component) {
		list.add(component);

	}

	@Override
	public void remove(Component component) {
		list.remove(component);

	}

	@Override
	public void getChild(int position) {
	 System.out.println(list.get(position).getName());

	}

}
