package edu.upc.eetac.dsa.ajarac.Ejercicio5;

public class AppThreads {
	public static void main (String []args) throws InterruptedException{
		ProcesoThread p1 = new ProcesoThread ("proceso 1");
		ProcesoRunnable pt2 = new ProcesoRunnable ("proceso 2");
		Thread p2 = new Thread (pt2, "");
		
		p1.start();
		p2.start();
		
		p1.join();
		p2.join();
		
		System.out.println("Se acabó");
	}
}
