package proxy;

import java.util.ArrayList;

public class Proxy implements IServer {
	
	
	private Server serverPrincipal = null;
	private Server serverSecundario = null;
	public Proxy() {

	}

	@Override
	public void descargar(String archivo) {
		if(serverPrincipal == null) {
			serverPrincipal = new Server();
			serverSecundario = new Server();
		}
		if(serverPrincipal.getArchivos().contains(archivo)) {
			this.serverPrincipal.descargar(archivo);
		}else {
			System.out.println("No se pudo descargar el archivo: " + archivo);
		}

	}

	@Override
	public void cargar(String archivo) {
		if(serverPrincipal == null) {
			serverPrincipal = new Server();
			serverSecundario = new Server();
		}
		if(archivo.endsWith(".zip") || archivo.endsWith(".rar")) {
			System.out.println("Server principal: ");
			serverPrincipal.cargar(archivo);
			System.out.println("Server secundario: ");
			serverSecundario.cargar(archivo);
		}else {
			System.out.println("El formato del archivo " + archivo + " no es soportado");
		}
		
		
	}

}
