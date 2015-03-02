package edu.upc.eetac.dsa.ajarac.Ejercicio4;

import java.io.IOException;

public class AppBinaria {
	public static void main(String [] args)  throws IOException{
		String fichero = "archivo.bin";
		Binarios b = new Binarios (2, 6.5, 'a');
		b.salvar_archivo(fichero);
		
		Binarios testleer = new Binarios();
		testleer = testleer.recuperar(fichero);
		System.out.println("entero: " + testleer.getEntero());
		System.out.println("decimal: " + testleer.getDecimal());
		System.out.println("char: " + testleer.getCaracter());
		
	}


}
