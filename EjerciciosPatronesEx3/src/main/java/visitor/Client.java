package visitor;

public class Client {

	public static void main(String[] args) {
		Perro perro = new Perro();
		perro.setEnfermedad(2);
		Gato gato = new Gato();
		gato.setEnfermedad(1);
		Caballo caballo = new Caballo();

		
		Veterinario vet = new Veterinario();
		
		perro.visitarVet(vet);
		gato.visitarVet(vet);
		caballo.visitarVet(vet);

	

	}

}
