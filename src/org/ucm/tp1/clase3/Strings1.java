package org.ucm.tp1.clase3;

public class Strings1 {

	public static void main(String[] args) {
		String s1 = "había una vez un barquito chiquitito";

		System.out.println(s1.indexOf("barquito"));
		System.out.println(s1.substring(s1.indexOf("barquito")));
		
		String s2 = "123,543,7,566,2";
		String[] resultado = s2.split(",");
		int[] resultadoAsInt = new int[resultado.length];
		int pos=0;
		for (String elem: resultado) {
			resultadoAsInt[pos++] = Integer.parseInt(elem);
		}
		int total = 0;
		for (int entero: resultadoAsInt) {
			System.out.println(entero);
			total += entero;
		}
		System.out.println("Total "+total);

		
	}

}
