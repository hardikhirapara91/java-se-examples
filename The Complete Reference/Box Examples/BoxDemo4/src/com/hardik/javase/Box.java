package com.hardik.javase;

/**
 * Box Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Box {

	private double width;
	private double height;
	private double depth;

	Box() {
		this.width = this.height = this.depth = -1;
	}

	Box(double len) {
		this.width = this.height = this.depth = len;
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(Box obj) {
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
	}

	/**
	 * Print box volume
	 */
	public void volume() {
		System.out.println("Volume: " + (this.width * this.height * this.depth));
	}
}
