package org.ucm.tp1.clase1;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hazAlgo() {
		System.out.println("Miau Miau");
	}

}
