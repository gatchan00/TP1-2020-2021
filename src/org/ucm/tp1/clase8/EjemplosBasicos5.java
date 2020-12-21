package org.ucm.tp1.clase8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EjemplosBasicos5 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		List<ClasePropia> lista = new ArrayList<>();
		for (int i=0;i<3;i++) {
			lista.add(new ClasePropia((int)(Math.random()*100),Math.random(),"ELEMENTO "+i));
		}
		ObjectOutputStream out = new ObjectOutputStream(
										new FileOutputStream("salidaGuay2.bin"));
		out.writeObject(lista);
		out.close();
				
		for (ClasePropia p:lista) {
			System.out.println(p);	
		}
		System.out.println("--------------------");
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("salidaGuay2.bin"));
		
		Object tmp = in.readObject();
		if (tmp instanceof ArrayList<?>) {
			ArrayList<ClasePropia> lectura1 = (ArrayList<ClasePropia>) tmp;
			for (ClasePropia p:lectura1) {
				System.out.println(p);	
			}
			
		}
		 
		in.close();

	}

}
