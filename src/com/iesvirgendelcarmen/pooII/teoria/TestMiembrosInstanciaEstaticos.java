package com.iesvirgendelcarmen.pooII.teoria;

public class TestMiembrosInstanciaEstaticos {

	public static void main(String[] args) {
		
		MiembrosInstanciaEstaticos m1 = 
				new MiembrosInstanciaEstaticos();
		m1.setValorNumerico(1);
		m1.setValorCadena("uno");
		m1.setValorEstaticoNumerico(10);
		m1.setValorEstaticoCadena("diez");
		
		System.out.printf("Variables de instancia: %d %s%n"
				+ "Variables de clase: %d %s%n",
				m1.getValorNumerico(), m1.getValorCadena(),
				m1.getValorEstaticoNumerico(),
				m1.getValorEstaticoCadena());
		
		MiembrosInstanciaEstaticos m2 = 
				new MiembrosInstanciaEstaticos();
		
		System.out.printf("Variables de instancia: %d %s%n"
				+ "Variables de clase: %d %s%n",
				m2.getValorNumerico(), m2.getValorCadena(),
				m2.getValorEstaticoNumerico(),
				m2.getValorEstaticoCadena());
		
		m2.setValorEstaticoNumerico(20);
		m2.setValorEstaticoCadena("veinte");
		
		System.out.printf("Variables de instancia: %d %s%n"
				+ "Variables de clase: %d %s%n",
				m1.getValorNumerico(), m1.getValorCadena(),
				m1.getValorEstaticoNumerico(),
				m1.getValorEstaticoCadena());
		
		System.out.println("Estático numérico con m1: " + m1.getValorEstaticoNumerico());
		System.out.println("Estático numérico con m2: " + m2.getValorEstaticoNumerico());
		System.out.println("Estático numérico con nombre de la clase: " + MiembrosInstanciaEstaticos.getValorEstaticoNumerico());

	}

}
