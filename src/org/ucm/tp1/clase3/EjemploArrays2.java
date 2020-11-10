package org.ucm.tp1.clase3;

public class EjemploArrays2 {
	public final static String ENDL = "\n";
	public static void main(String[] args) {
		int filas = 5;
		int columnas = 6;
		int [][] matriz = new int[5][6];
		
		for (int i=0;i<filas;i++) {
			matriz[i][i]=5;
		}
		for(int f = 0; f<filas;f++) {
			for (int c=0;c<columnas;c++) {
				System.out.print(matriz[f][c]+((c==columnas-1)?ENDL:" "));
			}
		}
		System.out.println("-----");
		for ( int[] fila:matriz) {
			for(int element:fila){
				System.out.print(element+" ");
			}
			System.out.println();
		}

	}

}




