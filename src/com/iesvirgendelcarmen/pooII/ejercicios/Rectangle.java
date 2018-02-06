package com.iesvirgendelcarmen.pooII.ejercicios;

public class Rectangle {
	
	private double height = 1;
	private double width = 1;
	
	private static int numberOfRectangle = 0;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
		numberOfRectangle ++;
	}
	
	public  Rectangle() {
		numberOfRectangle ++;
	}
	
	
	
	public static int getNumberOfRectangle() {
		return numberOfRectangle;
	}

	public double getArea () {
		return height * width;
	}
	
	public double getPerimeter () {
		return (height + width) * 2.0;
	}
	
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
	
	
}
