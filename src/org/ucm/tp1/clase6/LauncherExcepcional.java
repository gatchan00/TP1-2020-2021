package org.ucm.tp1.clase6;

public class LauncherExcepcional {

	public static void main(String[] args) {
		System.out.println("HOLAAAA");

		try {
			int a = 3;
			int b = 0;
			int z = a/b;
			System.out.println("El resultado es " + z);
		}
		catch(NullPointerException e){
			System.out.println("Ha fallado por null pointer");
		}		
		catch(ArithmeticException e){
			System.out.println("Ha fallado por Aritmethic");
		}				
		catch(Exception e){
			System.out.println("Ha fallado");
		}
		finally {
			System.out.println("FINAL");
		}
	}

}
