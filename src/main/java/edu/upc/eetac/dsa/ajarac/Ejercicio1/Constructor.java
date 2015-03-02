package edu.upc.eetac.dsa.ajarac.Ejercicio1;

public class Constructor {
	public static void main(String args[]) {
		Tree[] arboles = new Tree[4];
		arboles[0] = new Tree(4);
		arboles[1] = new Tree("Roble");
		arboles[2] = new Tree();
		arboles[3] = new Tree(5, "Pino");

		int i = arboles.length;
		int j = 0;
		while (j < i) {
			if (arboles[j].getMetros() == 0)
			System.out.println("Un " + arboles[j].getNombre());
			else
				System.out.println("Un " + arboles[j].getNombre() + " de " + arboles[j].getMetros() + " metros");
			j++;
		}
	}
}
