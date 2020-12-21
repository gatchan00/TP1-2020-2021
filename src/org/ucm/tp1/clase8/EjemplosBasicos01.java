package org.ucm.tp1.clase8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
public class EjemplosBasicos01 {

	public static void main(String[] args) throws Exception {
		
		File fichero = new File("README.md");
		System.out.println(fichero.getCanonicalPath());
		Reader in1 = new FileReader(fichero);
		
		File directorioSalida = new File("savegames");
		if (	directorioSalida != null 
				&& directorioSalida.isDirectory() 
				&& directorioSalida.canWrite()) {
			System.out.println("PUEDO ECHCRIBI!!!");
		}
		else {
			System.out.println("NO existe o no se puede");
		}
		BufferedReader buffin1 = new BufferedReader(in1);


	}

}
