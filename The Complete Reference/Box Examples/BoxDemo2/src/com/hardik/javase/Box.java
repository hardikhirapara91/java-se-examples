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

	// Set Volume Dimentions
	public void setDimention(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	/**
	 * Return Box Volume
	 * 
	 * @return
	 */
	public double getBoxVolume() {
		return (this.width * this.height * this.depth);
	}
}
