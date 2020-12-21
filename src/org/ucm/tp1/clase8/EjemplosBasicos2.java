package org.ucm.tp1.clase8;

import java.io.File;
import java.io.RandomAccessFile;

public class EjemplosBasicos2 {

	public static void main(String[] args) throws Exception {
		
		File fichero = new File("README.md");
		RandomAccessFile rin=new RandomAccessFile(fichero,"r");
		rin.seek(3);
		System.out.print(""+(char)rin.readByte());
		rin.seek(8);
		System.out.print(""+(char)rin.readByte());
		rin.seek(8);
		System.out.print(""+(char)rin.readByte());
		rin.close();

	}

}
