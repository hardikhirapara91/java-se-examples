package com.hardik.javase.model;

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
	 * Return box volume
	 * 
	 * @return
	 */
	public double volume() {
		return (this.width * this.height * this.depth);
	}

	@Override
	public String toString() {
		return "Box [width=" + this.width + ", height=" + this.height + ", depth=" + this.depth + "]";
	}
}
