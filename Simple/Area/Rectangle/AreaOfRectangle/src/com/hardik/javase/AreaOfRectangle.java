package com.hardik.javase;

/**
 * Area of Rectangle
 * @author HARDIK
 *
 */
public class AreaOfRectangle {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(12, 45);
		Rectangle r2 = new Rectangle();
		
		r2.setWidth(67);
		r2.setHeight(90);
		
		System.out.println(r1 + " Area: " + r1.calculateArea());
		System.out.println(r2 + " Area: " + r2.calculateArea());
	}
}
