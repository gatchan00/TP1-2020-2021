package org.ucm.tp1.clase6;

public class Hijo extends Padre implements PayunPayun {
	public void m1() {
		System.out.println("M1 de Hijo");
	}

	@Override
	public void dispara() {
		System.out.println("Hijo hace payun payun");
		
	}
}
