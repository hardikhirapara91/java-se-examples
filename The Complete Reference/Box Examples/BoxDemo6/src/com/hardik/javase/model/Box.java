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

	public Box() {
		this.width = this.height = this.depth = -1;
	}

	public Box(double length) {
		this.width = this.height = this.depth = length;
	}

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public Box(Box obj) {
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
}
