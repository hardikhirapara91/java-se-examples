package com.hardik.javase;

/**
 * Find Area of Circle
 * 
 * @author HARDIK HIRAPARA
 * 
 */
public class AreaOfCircle {

	private final static float PI = 3.14159f;

	public static void main(String[] args) {

		float radius = 123.456f;
		double area = PI * (radius * radius);

		System.out.println("Area of Circle: " + area);
	}
}