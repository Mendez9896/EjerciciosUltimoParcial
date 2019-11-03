package visitor;

import java.util.Date;

public class Veterinario implements IVisitor {

	Date fecha = new Date();
	
	
	@Override
	public double visit(Perro perro) {
		
		if(perro.getEnfermedad() == 1) {
			System.out.println("Se curo al perro de la enfermedad 1 en " + fecha);
		}else if (perro.getEnfermedad() == 2) {
			System.out.println("Se curo al perro de la enfermedad 2 en " + fecha);
		}else {
			System.out.println("No se curo de nada al perro");
		}


		return 0;
	}



	@Override
	public double visit(Gato gato) {
		if(gato.getEnfermedad() == 1) {
			System.out.println("Se curo al gato de la enfermedad 1 en " + fecha);
		}else if (gato.getEnfermedad() == 2) {
			System.out.println("Se curo al gato de la enfermedad 2 en " + fecha);
		}else {
			System.out.println("No se curo de nada al gato");
		}
		return 0;

	}

	@Override
	public double visit(Caballo caballo) {	
		if(caballo.getEnfermedad() == 1) {
		System.out.println("Se curo al caballo de la enfermedad 1 en " + fecha);
	}else if (caballo.getEnfermedad() == 2) {
		System.out.println("Se curo al caballo de la enfermedad 2 en " + fecha);
	}else {
		System.out.println("No se curo de nada al caballo");
	}

		return 0;
	}

}
