package com.hardik.javase.model;

/**
 * Box Weight Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxWeight extends Box {

	private double boxWeight;

	public BoxWeight(double width, double height, double depth, double boxWidth) {
		super(width, height, depth);
		this.boxWeight = boxWidth;
	}

	/**
	 * Return box width
	 * 
	 * @return
	 */
	public double getBoxWidth() {
		return this.boxWeight;
	}
}
