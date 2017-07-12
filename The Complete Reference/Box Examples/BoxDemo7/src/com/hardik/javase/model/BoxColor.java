package com.hardik.javase.model;

/**
 * Box Color
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxColor extends ShipmentCost {

	private String color;

	public BoxColor() {
		super();
		this.color = "-";
	}

	public BoxColor(double len, float weight, float cost, String color) {
		super(len, weight, cost);
		this.color = color;
	}

	public BoxColor(double w, double h, double d, float we, float cost, String color) {
		super(w, h, d, we, cost);
		this.color = color;
	}

	public BoxColor(BoxColor bc) {
		super(bc);
		this.color = bc.color;
	}

	/**
	 * Print Box Info
	 */
	@Override
	public void getBoxInfo() {
		super.getBoxInfo();
		System.out.println("Color: " + this.color);
	}

	@Override
	public String toString() {
		return "BoxColor [color=" + this.color + "]";
	}
}
