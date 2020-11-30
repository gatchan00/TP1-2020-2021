package org.ucm.tp1.clase6;

public class Launcher4 {


	public static void main(String[] args) {
		Padre p = new Hijo();
		if (p instanceof Hijo)
		{
			Hijo h = (Hijo)p;
			h.dispara();
		}

		Padre p2 = new Padre();
		if (p2 instanceof Hijo)
		{
			Hijo h2 = (Hijo)p2;
			h2.dispara();
		}
		else {System.out.println("Nooo no nonono");} 
		
		System.out.println(p.getClass().getName());
		
	}

}
