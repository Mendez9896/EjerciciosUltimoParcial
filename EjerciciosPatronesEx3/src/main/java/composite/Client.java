package composite;



public class Client {

	public static void main(String[] args) {
		Composite lab1 = new Composite("Lab 1");
		lab1.add(new Computadora("PC1"));

		lab1.add(new Computadora("PC2"));

		lab1.add(new Computadora("PC3"));
		
		Composite lab2 = new Composite("Lab 2");
		lab2.add(new Computadora("PC1"));

		lab2.add(new Computadora("PC2"));


		
		Composite cont1 = new Composite("Cont 1");
		
		cont1.add(lab1);
		cont1.add(lab2);
		
		cont1.operation();
	
		

		

	}

}
