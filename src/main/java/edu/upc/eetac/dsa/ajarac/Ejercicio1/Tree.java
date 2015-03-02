package edu.upc.eetac.dsa.ajarac.Ejercicio1;

public class Tree {
	private String nombre;
	private int metros;

	public Tree(int i) {
		this.metros = i;
		this.nombre = "árbol";
	}

	public Tree(String string) {
		this.nombre = string;
		this.metros = 0;
	}

	public Tree() {
		this.nombre = "árbol";
		this.metros = 0;
	}

	public Tree(int i, String string) {
		this.nombre = string;
		this.metros = i;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

}
