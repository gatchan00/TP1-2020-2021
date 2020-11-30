package org.ucm.tp1.clase6;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(new Integer(2));
		lista.add(new Integer(14));
		lista.add(new Integer(7));
		lista.add(new Integer(4));
		lista.add(new Integer(-5));
		for (Integer i: lista) {
			System.out.println(i);
		}
		lista.remove(2);
		lista.remove(new Integer(-5));
		for (int i = 0; i< lista.size(); i++) {
			System.out.println("pos "+i+": "+lista.get(i));
		}
		lista.clear();
		for (int i = 0; i< lista.size(); i++) {
			System.out.println("pos "+i+": "+lista.get(i));
		}
	}

}
