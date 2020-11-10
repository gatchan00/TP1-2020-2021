package org.ucm.tp1.clase2;

public class LauncherSobreCarga {

	public static void pintaNumeros(int n) {
		System.out.print("TIPO 1: ");
		System.out.println(n);
	}
	public static void pintaNumeros(int n, int y) {
		System.out.print("TIPO 2: ");
		System.out.println(n+ "  " + y);
	}
	public static void pintaNumeros(double n) {
		System.out.print("TIPO 3: ");
		System.out.println(n);
	}
	public static void pintaNumeros(double n, double y, double z) {
		System.out.print("TIPO 4: ");
		System.out.println(n+ "  " + y + " " +z);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pintaNumeros(5);
		pintaNumeros(5,7);
		pintaNumeros(5.0);
		pintaNumeros(1.0,2.0,3.0);
		pintaNumeros(1.0,2,3); //Esto funciona porque hace upcasting de INT a DOUBLE
		//pintaNumeros(5.1,7.1); esto da error porque no puede downcastear de double a INT
	}

}
