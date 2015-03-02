package edu.upc.eetac.dsa.ajarac.Ejercicio6;

public class App {
	public static void main(String[] args) {
		
		String texto = "Tres tigres comen trigo en un trigal\n";
	    Buffer buffer = new Buffer();
	    
	    Thread productor = new Thread(new Productor(buffer, texto));
	    Thread consumidor = new Thread(new Consumidor(buffer));
	
	    consumidor.start();
	    productor.start();
	}
}