package org.ucm.tp1.clase5;


class Animal{
	String nombre;
	public Animal(String nombre) { this.nombre=nombre;}
	public void hazCosas() {
		System.out.println("No hago nada, soy muy genérico");
	}
}
class Gato extends Animal{
	public Gato(String nombre) {
		super(nombre);
	}
	public void hazCosas() {
		System.out.println(this.nombre+" Myauuu");
	}
}
class Perro extends Animal{
	public Perro(String nombre) {
		super(nombre);
	}
	public void hazCosas() {
		System.out.println(this.nombre+" Woof");
	}
}

public class ArraysChungos {

	public static void oldmain(String[] args) {
		Animal[] animales = new Animal[10];
		for (int i=0;i<10;i++) {
			if (Math.random()>0.5) {
				animales[i]=new Perro("Perro "+i);
			}
			else {
				animales[i]=new Gato("Gato "+i);
			}
		}
		animales[0] = new Perro("Perro hardcodeado");
		for (Animal a:animales) {
			a.hazCosas();
		}
	}
	public static void main(String[] args) {
		Animal[] animales;
		Gato[] gatos= new Gato[10];
		for (int i=0;i<10;i++) {
			gatos[i]=new Gato("Gato "+i);

		}
		animales = gatos;
		animales[0] = new Perro("Perro hardcodeado");
		for (Animal a:animales) {
			a.hazCosas();
		}
	}

}
