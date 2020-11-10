package org.ucm.tp1.clase2;

public class ComparaConEquals {

	public static class B{
		private int z;
		public B(int z) { this.z = z;}
		public boolean equals(B b) {
			return this.z == b.z;
		}
	}
	
	public static class A{
		private int x;
		private B b;
		public A(int x, B b) {
			this.x=x;
			this.b=b;
		}
		
		public boolean equals(A a) {
			return (this.x == a.x && b.equals(a.b) );
		}
		
	}
	public static void main(String[] args) {
		B b1 = new B(5);
		B b2 = new B(5);
		A a1 = new A(2,b1);
		A a2 = new A(2,b2);
		
		if (a1.equals(a2))
			System.out.println("CIERTO");
		else
			System.out.println("FALSO");

	}

}
