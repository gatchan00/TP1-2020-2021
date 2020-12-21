package org.ucm.tp1.clase8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EjemplosBasicos04 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ClasePropia ejemplo1 = new ClasePropia(2,2.34,"Algo");
		ClasePropia ejemplo2 = new ClasePropia(9,8.17,"Zacarías");
		ObjectOutputStream out = new ObjectOutputStream(
										new FileOutputStream("salidaGuay.bin"));
		out.writeObject(ejemplo1);
		out.writeObject(ejemplo2);
		out.close();
				
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("salidaGuay.bin"));
		Object tmp = in.readObject();
		if (tmp instanceof ClasePropia) {
			ClasePropia lectura1 = (ClasePropia) tmp;
			System.out.println(lectura1);
		}
		
		tmp = in.readObject();
		if (tmp instanceof ClasePropia) {
			ClasePropia lectura1 = (ClasePropia) tmp;
			System.out.println(lectura1);
		}
		
		in.close();

	}

}
