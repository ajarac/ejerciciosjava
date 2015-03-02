package edu.upc.eetac.dsa.ajarac.Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AverageFileCalculator {

	public static double average(String string) throws FileParsingException {
		double count = 0;
		double sum = 0;
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(string));
			String line = null;
			while ((line = reader.readLine()) != null) {
				try {
					int i = Integer.parseInt(line);
					System.out.println("Numero leido: " + i);
					try {
						comprobar(i, count);

					} catch (BigNumberException e) {
						e.printStackTrace();
					}
					if (i < 1000) {
						sum = sum + i;
						++count;
					}
				} catch (NumberFormatException e) {
					throw new NumberFormatException(e.getMessage());
				}
			}
		} catch (java.io.IOException e) {
			throw new FileParsingException(e.getMessage());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.err.println("warning: can not close file.");
			}
		}
		return (sum / count);
	}

	private static void comprobar(int i, double count)
			throws BigNumberException {
		if (i > 1000) {
			throw new BigNumberException("Numero mayor de 1000 en la posición "
					+ count);
		}
	}

}