package org.ucm.tp1.clase1;

public class EjemploReferencias {

	
	static class Wrapper{
		public int value;
		public Wrapper(int n) {
			value=n;
		}
	}
	public static int suma(Wrapper x, Wrapper y) {
		
		x = new Wrapper(5);
		return x.value+y.value;
	}
	
	public static void main(String[] args) {
		Wrapper num1 = new Wrapper(3);
		Wrapper num2 = new Wrapper(2);
		System.out.println(suma(num1, num2));
		System.out.println(num1.value);
	}

}
