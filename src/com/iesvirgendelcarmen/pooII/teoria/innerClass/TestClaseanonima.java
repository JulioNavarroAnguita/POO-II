package com.iesvirgendelcarmen.pooII.teoria.innerClass;

public class TestClaseanonima {

	public static void main(String[] args) {
		ClaseAnonima claseAnonima = new ClaseAnonima() {
			
			@Override
			public void metodo() {
				System.out.println("Mensaje uno");
				
			}
		};
		
		claseAnonima.metodo();
		(new ClaseAnonima() {
			
			@Override
			public void metodo() {
				System.out.println("Mensaje dos");
				
			}
		}).metodo();
		
		
	}
	
	
	
	

}
