package org.ucm.tp1.clase1;

public class LauncherAnimal {


	public static void main(String[] args) {
		
		System.out.println(Animal.dameID());
		Perro p = new Perro("Firulais");
		p.hazAlgo();
		Gato g = new Gato("Michi");
		g.hazAlgo();
		Animal a = new Perro("Bulbasur");
		a.hazAlgo();
		
	}

}
