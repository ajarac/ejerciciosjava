package edu.upc.eetac.dsa.ajarac.Ejercicio2;

public class Circle extends Shape {
	private double radio;

	public Circle(double d) {
		super("circle");
		this.radio = d;
		
	}

	public double getDist() {
		return radio;
	}

	public void setDist(double dist) {
		this.radio = dist;
	}
	
	@Override
	public double area()
	{
		return(Math.PI*radio*radio);
	}

}
