package com.hardik.javase.model;

/**
 * Box Width Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxWidth extends Box {

	private double weight;

	public BoxWidth() {
		super();
		this.weight = 0.00;
	}

	BoxWidth(double len, double weight) {
		super(len);
		this.weight = weight;
	}

	public BoxWidth(double w, double h, double d, double weight) {
		super(w, h, d);
		this.weight = weight;
	}

	BoxWidth(BoxWidth obj) {
		super(obj);
		this.weight = obj.weight;
	}

	/**
	 * Return box width
	 * 
	 * @return
	 */
	public double getBoxWeight() {
		return this.weight;
	}
}
