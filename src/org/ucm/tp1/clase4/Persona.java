package org.ucm.tp1.clase4;

public class Persona {
	protected int numero;
	protected String nombre;
	public Persona(int numero, String nombre)
	{	
		System.out.println("Llamada al constructor Persona");
		this.numero = numero;
		this.nombre = nombre;
	}
	public void showMe() {
		System.out.println("I am "+nombre+" with number "+numero);
	}
	public int getNumero() { return numero;}
}
