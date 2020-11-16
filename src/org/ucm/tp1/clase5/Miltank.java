package org.ucm.tp1.clase5;

public class Miltank extends Pakimon implements Volador{
	public Miltank(String n) {
		super(80, 30, 450, n);
	}

	@Override
	public void ataca(Pakimon atacado) {
		if(this.ataque - (atacado.defensa/3)>1)
			atacado.vida = this.ataque - (atacado.defensa/3);
		else
			atacado.vida -= 1;
		
	}

	@Override
	public void fly(String destino) {
		System.out.println("Miltank te lleva gracilmente a "+destino);
	}
}
