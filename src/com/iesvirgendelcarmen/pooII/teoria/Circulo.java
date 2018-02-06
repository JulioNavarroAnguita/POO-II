package com.iesvirgendelcarmen.pooII.teoria;

public class Circulo {
	
	private int radio;
	public static int numeroCirculos = 0;
	
	public Circulo(int radio) {
		this.radio = radio;
		numeroCirculos++; //incrementamos el nº de circulos
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	
	
	
}
