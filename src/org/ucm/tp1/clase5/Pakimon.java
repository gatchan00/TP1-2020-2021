package org.ucm.tp1.clase5;

public abstract class Pakimon {
	protected int defensa;
	protected int ataque;
	protected int vida;
	protected String nombre;
	public Pakimon(int d, int a, int v, String n) {
		this.vida=v;
		this.defensa=d;
		this.nombre=n;
		this.ataque=a;
	}
	public abstract void ataca(Pakimon atacado);
}
