package org.ucm.tp1.clase4;

public class Ciudadano extends Persona{
	private int puntosDelCarne;
	public Ciudadano(int numero, String nombre) {
		super(numero, nombre);
		System.out.println("Llamada al constructor Ciudadano");
		puntosDelCarne=15;
	}
	@Override
	public void showMe() {
		super.showMe();
		System.out.println("Y tengo "+puntosDelCarne+" puntos");
	}
	
	public boolean puedeVotar() {
		return this.numero >= 18;
	}
	public int getPuntosDelCarne() { return puntosDelCarne;}
}
