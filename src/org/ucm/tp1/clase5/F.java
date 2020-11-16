package org.ucm.tp1.clase5;

import org.ucm.tp1.clase4.Ciudadano;
import org.ucm.tp1.clase4.MegaCiudadano;
import org.ucm.tp1.clase4.Persona;

/**
 *   Persona  
 *   	|
 *   Ciudadano
 *   	|
 *   MegaCiudadano
 * */
public class F {
	public Ciudadano f1(Ciudadano c) { return c;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class miniF extends F{
	//public Ciudadano f1(Persona c) { return new Ciudadano(2,"");}//sobreescritura porque Persona es más genérico que Ciudadano
	//public Ciudadano f1(MegaCiudadano c) { return c;}//Sobrecarga, porque MegaCiudadano es más específica que Ciudadano
	public Persona f1(MegaCiudadano c) { return c;}//sobrecarga
	public MegaCiudadano f1(Ciudadano c) { return new MegaCiudadano(2,"32");}//sobreescritura
	public Persona f1( Persona p) {return p;}
}
/**
s1->s2		t1->T2
s1 != t1
s2 = t2
*/

