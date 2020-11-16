package org.ucm.tp1.clase5;

public class Chicorita extends Pakimon {
	public Chicorita(String n) {
		super(50,60,200,n);
	}

	@Override
	public void ataca(Pakimon atacado) {
		atacado.vida = this.ataque;
		
	}
	
}
