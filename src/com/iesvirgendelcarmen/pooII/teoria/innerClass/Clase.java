package com.iesvirgendelcarmen.pooII.teoria.innerClass;

public class Clase {

	public static void main(String[] args) {
		Uno uno = new Uno("atributo");
		System.out.println(uno);
	}
	
	public class Dos {
		
		private int atributo;

		public Dos(int atributo) {
			this.atributo = atributo;
		}

		@Override
		public String toString() {
			return "Dos [atributo=" + atributo + "]";
		}
		
		private class Tres {
			
		}
		
	}

}
class Uno {
	private String atributo;

	public Uno(String atributo) {
		this.atributo = atributo;
	}

	@Override
	public String toString() {
		return "Uno [atributo=" + atributo + "]";
	}
	
}
