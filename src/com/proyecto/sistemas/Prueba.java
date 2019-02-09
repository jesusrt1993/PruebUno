package com.proyecto.sistemas;

import java.util.Scanner;

public class Prueba {

	public static void main(String args[])
	{
		int a=0;
		int b=0;
		int c=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hola Mundo con Git Hub");
		
		System.out.println("Ingrese el valor de a ");
		a=sc.nextInt();
		
		System.out.println("Ingresa el valor de b ");
		b=sc.nextInt();
		
		Metodos met = new Metodos();
		met.sumar(a, b);
		
		System.out.println("La suma es: "+ met.sumar(a, b));
	}
	
}
