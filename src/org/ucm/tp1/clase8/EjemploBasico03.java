package org.ucm.tp1.clase8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploBasico03 {

	public static void main(String[] args) throws IOException {
		FileOutputStream outraw = new FileOutputStream("ficheroSalvaje.bin");
		DataOutputStream out = new DataOutputStream(outraw);
		out.writeInt(33);
		out.writeLong(42);
		out.writeInt(66);
		out.writeUTF("Dios, ¿Funcionará esto?");
		out.close();
		
		FileInputStream inraw = new FileInputStream("ficheroSalvaje.bin");
		DataInputStream in = new DataInputStream(inraw);
		System.out.println(in.readInt());
		System.out.println(in.readInt());
		System.out.println(in.readInt());
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
		in.close();
	}

}
