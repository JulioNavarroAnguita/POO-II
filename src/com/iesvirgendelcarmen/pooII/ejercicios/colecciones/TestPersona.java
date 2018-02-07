package com.iesvirgendelcarmen.pooII.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> listaPersonas   = new ArrayList<>();
		Set<Persona> conjuntoPersonas = new HashSet<>();
		
		Persona persona1 = new Persona("juan", "12", 12);
		Persona persona2 = new Persona("luis", "25", 25);
		Persona persona3 = new Persona("felipe", "11", 12);
		Persona persona4 = new Persona("jacinto", "35", 25);
		Persona persona5 = new Persona("jacinto", "35", 25);
		Persona persona7 = new Persona( null, "35", 0);

		Persona persona6 = persona1;

		listaPersonas.add(persona1);
		listaPersonas.add(persona4);
		listaPersonas.add(persona3);
		listaPersonas.add(persona2);
		listaPersonas.add(persona1);
		listaPersonas.add(persona4);
		listaPersonas.add(persona3);
		listaPersonas.add(persona2);
		listaPersonas.add(persona5);
		listaPersonas.add(persona6);
		listaPersonas.add(new Persona("jacinto", "35", 25));

		
		conjuntoPersonas.add(persona1);
		conjuntoPersonas.add(persona4);
		conjuntoPersonas.add(persona3);
		conjuntoPersonas.add(persona2);
		conjuntoPersonas.add(persona1);
		conjuntoPersonas.add(persona4);
		conjuntoPersonas.add(persona3);
		conjuntoPersonas.add(persona2);
		conjuntoPersonas.add(persona5);
		conjuntoPersonas.add(persona6); // persona5 = persona6
		conjuntoPersonas.add(new Persona("jacinto", "35", 25));
		conjuntoPersonas.add(new Persona("pedro", "35", 25));
		conjuntoPersonas.add(persona7);

		
	//	System.out.println(listaPersonas);
		
		System.out.println(conjuntoPersonas);
		Set<String> conjuntoCadenas = new HashSet<>();
		conjuntoCadenas.add(new String("hola"));
		conjuntoCadenas.add("hola");
		String string1 = "hola";
		String string2 = "hola";
		String string3 = new String("hola");
		conjuntoCadenas.add(string1);
		conjuntoCadenas.add(string2);
		conjuntoCadenas.add(string3);
		System.out.println(conjuntoCadenas);

		
		
		
		


	}

}
