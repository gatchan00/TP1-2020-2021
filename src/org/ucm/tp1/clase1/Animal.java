package org.ucm.tp1.clase1;

public class Animal {
	private String nombre;
	private static final int MEGA_ID = 3;
	public Animal() {};
	public Animal(String nombre) { 
		this.nombre = nombre;
	}
	public void hazAlgo() {
		System.out.println("....");
	}
	
	protected void metodoSecreto() {
		System.out.println("SECRETOOOO");
	}
	
	public static int dameID() {
		return MEGA_ID;
	}


}
