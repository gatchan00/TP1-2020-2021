package org.ucm.tp1.clase0;

public class FirstLauncher {

 
	public static void main(String[] args) {
		NombreClean caca1=new NombreClean(7,"Rugosa");
		NombreClean caca2=new NombreClean(7,"Rugosa");
		if (caca1.equals(caca2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintos");
		}

		
	}

}
