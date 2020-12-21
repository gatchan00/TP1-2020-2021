package org.ucm.tp1.clase8;

import java.io.Serializable;

public class ClasePropia implements Serializable{
	private int a;
	private double b;
	private String c;
	private transient int secreto;
	
	@Override
	public String toString() {
		return "ClasePropia [a=" + a + ", b=" + b + ", c=" + c + ", secreto="+secreto+"]";
	}
	public ClasePropia(int a, double b, String c) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.secreto = (int)(Math.random()*1000);
	}
	//muchos métodos y cosas...
}
