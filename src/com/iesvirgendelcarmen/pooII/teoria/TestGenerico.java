package com.iesvirgendelcarmen.pooII.teoria;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generico generico1 = new Generico();
		generico1.addItem("hola");
		generico1.addItem("otro hola");
		generico1.addItem("nuevo saludo");
		System.out.println(generico1.getLista());
		System.out.printf("Elemento %d es %s%n",
				2, generico1.getItem(1));
		
		Generico generico2 = new Generico();
		Persona persona1 = new Persona("pepe", 12);
		Persona persona2 = new Persona("felipe", 42);
		Persona persona3 = new Persona("augusto", 32);
		Persona persona4 = new Persona("luisa", 22);
		generico2.addItem(persona1);
		generico2.addItem(persona2);
		generico2.addItem(persona3);
		generico2.addItem(persona4);
		System.out.println(generico2.getLista());
		System.out.printf("Elemento %d es %s%n",
				22, generico2.getItem(2));
		
		Generico generico3 = new Generico();
		generico3.addItem(1);
		generico3.addItem(2);
		generico3.addItem(3);
		generico3.addItem(4);
		System.out.println(generico3.getLista());
		System.out.printf("Elemento %d es %s%n",
				2, generico3.getItem(2));

	}

}
