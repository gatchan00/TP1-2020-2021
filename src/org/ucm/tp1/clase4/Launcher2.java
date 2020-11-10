package org.ucm.tp1.clase4;

public class Launcher2 {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("-------EMPEZAMOS----------");
		MegaCiudadano m1 = new MegaCiudadano(1,"chachi");
		MegaCiudadano m2 = new MegaCiudadano(2,"piruli");
		m1 = null;
		Thread.sleep(1000);
		System.gc();
		Thread.sleep(1000);
		
		System.gc();
		Thread.sleep(1000);
		System.out.println("-------ACABAMOS----------");
	}

}
