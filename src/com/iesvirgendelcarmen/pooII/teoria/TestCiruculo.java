package com.iesvirgendelcarmen.pooII.teoria;

import java.util.ArrayList;
import java.util.List;

public class TestCiruculo {
	public static void main(String[] args) {
		List<Circulo> listaCirculos = new ArrayList<>();
		for(int i = 0; i < 1000; i++) {
			/*int radioAleatorio = (int) (Math.random() * 1000 + 1);
			Circulo c = new Circulo(radioAleatorio);
			listaCirculos.add(c);*/
			listaCirculos.add(
					new Circulo((int) (Math.random() * 1000 + 1)));
		}
		listaCirculos.add(299, new Circulo(100));
		System.out.println("Nº círculos: " + Circulo.numeroCirculos);
		System.out.println(listaCirculos.get(299));
		System.out.println(listaCirculos.get(299).numeroCirculos);
		for(int i = 100; i < 200; i++) {
			System.out.println(listaCirculos.get(i) +" - " + listaCirculos.get(i).numeroCirculos);
		}
	}
}
