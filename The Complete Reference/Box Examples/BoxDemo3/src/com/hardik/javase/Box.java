package com.hardik.javase;

/**
 * Box Class
 * 
 * @author HARDIK
 *
 */
public class Box {

	private double width;
	private double height;
	private double depth;

	// Constructor used when no dimensions specified
	Box() {
		this.width = this.height = this.depth = -1;
	}

	// Constructor used when cube is created
	Box(double len) {
		this.width = this.height = this.depth = len;
	}

	// Constructor used when all dimensions specified
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	/**
	 * Print box volume
	 */
	public void volume() {
		System.out.println("Volume: " + (this.width * this.height * this.depth));
	}
}
