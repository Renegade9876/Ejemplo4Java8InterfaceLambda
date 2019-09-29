package com.renegade;

public class Ejemplo4Java8Interface {

	/** Utilizando clases anónimas con Java 7.
	public double sumar(double d1, double d2) {
		return d1+d2;
	} */
	
	public static void main(String[] args) {
		Ejemplo4Java8Interface ejemplo4 = new Ejemplo4Java8Interface();
		
		// Utilizando clases anónimas con Java 7.
		// System.out.println(ejemplo3.sumar(10, 20));
		
		// Con Java 8, asigno una Lambda 
		Operacion operacion = (double d1, double d2) -> d1+d2;
		System.out.println(operacion.sumar(10, 20));
		
		
	}


}
