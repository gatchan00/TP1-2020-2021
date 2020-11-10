package org.ucm.tp1.clase3;

public class ArrayConClase {
	public static class Persona{
		private String name;
		public Persona(String name) { this.name=name;}
		@Override
		public String toString() {return "Persona["+name+"]";}
		public void diAlgo() {System.out.println("ALGO");}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] miArray=new Persona[3];
		miArray[0]=new Persona("Cerillo");
		//miArray[1]=new Persona("Mineta");
		miArray[2]=new Persona("Kenshin");
		for (Persona p:miArray) {
			if (p!=null) p.diAlgo();
			System.out.println(p);
		}

	}

}
