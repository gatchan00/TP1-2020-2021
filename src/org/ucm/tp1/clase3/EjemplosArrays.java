package org.ucm.tp1.clase3;

public class EjemplosArrays {

	public static void main(String[] args) {
		int[] miArrayEnteros = {1, 2, 3, 4, 5};
//		miArrayEnteros = new int[5];
		/*
		for (int i = 0; i<miArrayEnteros.length; i++) {
			miArrayEnteros[i] = i*10;
		}*/
		miArrayEnteros[3] = 33;
		for (int currElement: miArrayEnteros) {
			System.out.println(currElement);
		}

		for (int i = 0; i < miArrayEnteros.length; i++) {
			System.out.println("pos "+i+" -> "+miArrayEnteros[i]);
		}

	}

}
