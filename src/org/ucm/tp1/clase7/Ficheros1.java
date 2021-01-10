package org.ucm.tp1.clase7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ficheros1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("README.md");
			out = new FileOutputStream("salida.txt");
			int i = in.read();
			while (i!=-1) {
				System.out.print((char)i);
				out.write(i);
				i = in.read();
				Thread.sleep(50);
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
