package org.ucm.tp1.clase1;

public class Racional {
	private int num;
	private int den;

	public Racional(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public String toString() {
		String temp = num+"";
		String aux = "";
		for (int i=0;i<temp.length();i++) {
			aux+="-";
		}
		return num+"\n"+aux+"\n"+den;
	}

	public void productoEscalar(int escalar) {
		num = num * escalar;
	}
	public void multiplicar(Racional r) {
		num = num * r.num;
		den = den * r.den;
	}

	public static void main(String [] args) {
		Racional r = new Racional(4,5);
		System.out.println(r);
		System.out.println();
		r.productoEscalar(2);
		System.out.println(r);  //8/5
		System.out.println();
		Racional r2 = new Racional(3,6);
		r.multiplicar(r2);
		System.out.println(r);  //24/30
		System.out.println();
	}
}
