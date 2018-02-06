package com.iesvirgendelcarmen.pooII.teoria;

import java.util.ArrayList;
import java.util.List;

public class Matematicas {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(Matematicas.factorial(20));
		Matematicas matematicas = new Matematicas();
		System.out.println(matematicas.factorial(20));
		System.out.println(matematicas.buscarMultiplos(50,7));

	}
	//calculo factorial de un nº
	// 7! = 7 * 6 * 5 * .... * 1
	// 4! = 4 * 3 * 2 * 1
	public static long factorial (int numero) { 
		long resultado = 1;
		for (int i = numero; i > 0; i--) {
			//System.out.println(i);
			resultado *= i;
		}
		return resultado;
	}
	
	//buscamos múltiplos de un nº dentro de un rango
	// buscarMultiplos (20,3) -> 3,6,9,12,15,18
	// buscarMultiplos (50,7) -> 7, 14, 21, 28, 35, 42, 49
	
	public List<Integer> buscarMultiplos (int rango, int numero){
		List<Integer> listaMultiplos = new ArrayList<>();
		for (int i = numero; i <=  rango; i++) 
			if (i % numero == 0)
				listaMultiplos.add(i);
		
		return listaMultiplos;
	}
	
	
	
	
}
