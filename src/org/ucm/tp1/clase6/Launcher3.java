package org.ucm.tp1.clase6;

public class Launcher3 {

	public static void f(Padre p) {
		System.out.println("F de Padre");
	}
	
	public static void main(String[] args) {
		Padre p1 = new Padre();
		Padre p2 =new Hijo();
		Hijo h = new Hijo();
		
		f(p1);
		f(p2);
		f(h);

	}
}
