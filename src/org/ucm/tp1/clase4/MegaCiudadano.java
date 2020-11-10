package org.ucm.tp1.clase4;

public class MegaCiudadano extends Ciudadano{

	private static int x;
	private int y;
	{
		System.out.println("Llamada al inicializador de MegaCiudadano");
		y=99;
	}
	static {
		System.out.println("Llamada al inicialziador estático de MegaCiudadano");
		x = 1000;
	}
	public MegaCiudadano(int numero, String nombre) {
		super(numero, nombre);
		System.out.println("Llamada al constructor de MegaCiudadano");
	}

	@Override
	public void finalize(){
		System.out.println("Llamada al destructor de MegaCiudadano");
	}
	
}
