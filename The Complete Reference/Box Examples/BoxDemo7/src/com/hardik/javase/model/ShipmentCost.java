package com.hardik.javase.model;

/**
 * ShipmentCost
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ShipmentCost extends BoxWeight {

	private float cost;

	public ShipmentCost() {
		super();
		this.cost = 0.0f;
	}

	ShipmentCost(double len, float weight, float cost) {
		super(len, weight);
		this.cost = cost;
	}

	ShipmentCost(double width, double height, double depth, float weight, float cost) {
		super(width, height, depth, weight);
		this.cost = cost;
	}

	ShipmentCost(ShipmentCost sc) {
		super(sc);
		this.cost = sc.cost;
	}

	/**
	 * Print Box Info
	 */
	@Override
	public void getBoxInfo() {
		super.getBoxInfo();
		System.out.println("Cost: " + this.cost);
	}

	@Override
	public String toString() {
		return "ShipmentCost [cost=" + this.cost + "]";
	}
}
