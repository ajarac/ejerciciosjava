package edu.upc.eetac.dsa.ajarac.Ejercicio2;

public class Rectangle extends Shape {
	private int base;
	private int altura;
	
	public Rectangle(int i, int j) {
		super("rectangle");
		this.base = i;
		this.altura = j;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public double area(){
		return (base*altura);
	}
}
