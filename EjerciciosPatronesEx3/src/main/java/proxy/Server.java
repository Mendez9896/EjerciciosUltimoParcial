package proxy;

import java.util.ArrayList;

public class Server implements IServer {


	private ArrayList<String> archivos = new ArrayList<String>();
	public Server() {
	
	}
	@Override
	public void descargar(String archivo) {
		System.out.println("Se descargo el archivo: " + archivo);

	}
	@Override
	public void cargar(String archivo) {
		archivos.add(archivo);
		System.out.println("Se cargo el archivo: " + archivo);
		
	}
	public ArrayList<String> getArchivos() {
		return archivos;
	}
	public void setArchivos(ArrayList<String> archivos) {
		this.archivos = archivos;
	}

}
