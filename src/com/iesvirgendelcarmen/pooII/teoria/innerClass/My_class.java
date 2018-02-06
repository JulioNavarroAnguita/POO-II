package com.iesvirgendelcarmen.pooII.teoria.innerClass;

public class My_class {

	public static void main(String[] args) {
		Outer_Demo outer_Demo = new Outer_Demo();
		outer_Demo.setNombre("OUTER");
	//	System.out.println(outer_Demo.getNombre());
		System.out.println(outer_Demo.getSaludo());
		Outer_Demo.Inner2 inner2 = outer_Demo.new Inner2();
		System.out.println(inner2.getNombreOuter());
		System.out.println(metodoLocal());
		Outer_Demo.Inner4 inner4 = new Outer_Demo.Inner4();
		System.out.println(inner4.getFinal());
	}

	private static String metodoLocal() {
		final String mensajeLocal = "Hola desde método local";
		class Inner3 {
			private String getMensajeLocal () {
				return mensajeLocal;
			}
		}
		Inner3 inner3 = new Inner3();
		return inner3.getMensajeLocal();
	}
	
	

}
class Outer_Demo {
	private String nombreOuter;

	/*public String getNombre() {
		return nombreOuter;
	}*/

	public void setNombre(String nombre) {
		this.nombreOuter = nombre;
	}
	private class Inner_Demo{
		private String nombreInner;

		private Inner_Demo(String nombreInner) {
			this.nombreInner = nombreInner;
		}
		
		private String getSaludo() {
			return "Hola " + nombreInner;
		}
	}
	public String getSaludo() {
		Inner_Demo inner_Demo = new Inner_Demo("INNER");
		return "saludo " + inner_Demo.getSaludo();
	}
	
	public class Inner2 {
		public String getNombreOuter() {
			return nombreOuter;
		}
	}
	
	public static class Inner4{
		public  String getFinal() {
			return "Fin de clase internas";
		}
	}
	
	
}