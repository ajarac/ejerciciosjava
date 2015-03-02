package edu.upc.eetac.dsa.ajarac.Ejercicio4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarios {
	private int entero;
	private double decimal;
	private char caracter;

	public Binarios(int i, double d, char c) {
		this.entero = i;
		this.decimal = d;
		this.caracter = c;
	}

	public void salvar_archivo(String fichero) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(
				fichero));
		dos.writeInt(entero);
		dos.writeDouble(decimal);
		dos.writeChar(caracter);
		dos.close();
	}
	public Binarios (){
		
	}
	public  Binarios recuperar(String fichero) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream(fichero));
		int i = in.readInt();
		double dec = in.readDouble();
		char c = in.readChar();
		in.close();
		Binarios bin = new Binarios(i, dec, c);
		return bin;
	}

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
}
