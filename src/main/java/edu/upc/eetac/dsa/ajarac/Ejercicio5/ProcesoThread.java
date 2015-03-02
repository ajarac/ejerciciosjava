package edu.upc.eetac.dsa.ajarac.Ejercicio5;

public class ProcesoThread extends Thread {

	private String nombre;
	private long timesleep;

	public ProcesoThread(String string) {
		this.nombre = string;
	}

	public void run() {
		int count = 1;
		
		while (count <= 10) {
			try {
				timesleep = (long) (Math.random() * 2000);
				Thread.sleep(timesleep);
				System.out.println(nombre + " tiempo : " + timesleep + "ms [" + count + "]");
				count ++;
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
