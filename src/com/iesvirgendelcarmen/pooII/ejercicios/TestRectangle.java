package com.iesvirgendelcarmen.pooII.ejercicios;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle;
		rectangle = new Rectangle();
		new Rectangle();
		Rectangle rectangle1 = new Rectangle(12, 22.3);
		printRectangle(rectangle1);
		
		Rectangle rectangle2 = new Rectangle();
		printRectangle(rectangle2);
		
		Rectangle rectangle3 = new Rectangle(1, 1);
		printRectangle(rectangle3);
		
	}
	
	public static void printRectangle (Rectangle rectangle) {
		System.out.printf("Rectangle area and rectangle perimeter "
				+ "of %S is%n%.2f and %.2f%nNumber of rectangle is: %d%n", rectangle.toString(),
				rectangle.getArea(), rectangle.getPerimeter(), 
				Rectangle.getNumberOfRectangle());
	}

}
