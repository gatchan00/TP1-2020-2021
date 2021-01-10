package org.ucm.tp1.clase7;

public class PersonaPersonita {
	private int edad;
	private String nombre;
	public PersonaPersonita(int edad, String nombre) {
		this.edad=edad;
		this.nombre = nombre;
	}

	public void votoEnLasElecciones() throws NotOldEnoughException{
		//Vota en las elecciones
		if (edad<18) {
			NotOldEnoughException e = new NotOldEnoughException("No puede votar");
			throw e;
		}
	}

	public static void main(String[] args) {
		PersonaPersonita p =new PersonaPersonita(12,"HorseLuis");
		try 
		{
			p.votoEnLasElecciones();
			System.out.println("No ha fallado");
		}
		catch (NotOldEnoughException e) 
		{
			System.out.println(e.getMessage());
		}	
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
		finally 
		{
			System.out.println("Siempre se ejecuta");
		}
		System.out.println("Esto ha seguido");
	}

}
