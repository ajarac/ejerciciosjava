package edu.upc.eetac.dsa.ajarac.Ejercicio2;

public class AppInheritance {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(3, 5);
        
        int i = shapes.length;
        int j = 0;
        while (j<i)
        {
        	System.out.println("I'm a " + shapes[j].getType() + " whith area = "+ shapes [j].area());
        	j++;
        }
    }
}