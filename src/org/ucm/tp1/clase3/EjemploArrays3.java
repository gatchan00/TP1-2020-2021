package org.ucm.tp1.clase3;

public class EjemploArrays3 {

	public static void main(String[] args) {
		int[] array1 = {1,2,3};
		int[] array2 = {11,22,33};
		int[] array3 = array1;
		
		for(int i:array1) {
			System.out.println(i);
		}
		for(int i:array3) {
			System.out.println(i);
		}
		
		System.out.println("---");
		
		array3[2]=9;
		for(int i:array1) {
			System.out.println(i);
		}
		for(int i:array3) {
			System.out.println(i);
		}		
	}

}
