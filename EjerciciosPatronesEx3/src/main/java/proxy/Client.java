package proxy;


public class Client {

	public static void main(String[] args) {
		IServer proxy = new Proxy();
		proxy.cargar("ar1.zip");
		proxy.cargar("ar.txt");
		proxy.descargar("ar1.zip");
		proxy.descargar("ar.txt");
		
	}

}
