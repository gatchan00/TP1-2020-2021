package org.ucm.tp1.clase1;


public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void hazAlgo() {
		System.out.println("GUAU GUAU");
	}
}
