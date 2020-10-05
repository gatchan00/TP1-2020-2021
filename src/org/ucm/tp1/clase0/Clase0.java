package org.ucm.tp1.clase0;

public class Clase0 {
	public int publico=0;
	private int privado = 1;
	protected int protegido = 2;
	int packagePrivado = 3;
	public int f() {
		return privado+protegido;
	}
}
