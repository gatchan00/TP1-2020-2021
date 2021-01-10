package org.ucm.tp1.clase7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader("README.md"));
			out = new BufferedWriter(new FileWriter("salida.txt"));
			String linea = in.readLine();
			while (linea!=null) {
				System.out.println(linea);
				out.write(linea);
				out.write("\n");
				linea = in.readLine();
			} 
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe, acabamos...");
		}
		finally {
			if (in!=null)
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("Imposible hacer el close del fichero de entrada");
				}
			if (out!=null)
				try {
					out.close();
				} catch (IOException e) {
					System.out.println("Imposible hacer el close del fichero de salida");
				}			
		}
	}

}
