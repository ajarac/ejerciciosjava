package edu.upc.eetac.dsa.ajarac.Ejercicio3;

public class IOApp {
	public static void main(String[] args) {
		try {
			double average = AverageFileCalculator
					.average("/home/angel/workspace/ejerciciosjava/ficheros/ej3.txt");
			System.out.println("Media = " + average);
		} catch (FileParsingException e) {
			e.printStackTrace();
		}

	}
}
