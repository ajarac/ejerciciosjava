package edu.upc.eetac.dsa.ajarac.Ejercicio2;

public abstract class Shape {
	private String type;

	public Shape(String tipo) {
		this.setType(tipo);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract double area();
}
