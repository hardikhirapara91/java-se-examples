package com.hardik.javase;

/**
 * This is Box Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Box {

	private double width;
	private double height;
	private double depth;

	/**
	 * Set Volume
	 * 
	 * @param width
	 * @param height
	 * @param depth
	 */
	public void setVolumn(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	/**
	 * Print volume of box
	 */
	public void getVolumn() {
		System.out.println("Volumn is: " + (this.width * this.height * this.depth));
	}
}
