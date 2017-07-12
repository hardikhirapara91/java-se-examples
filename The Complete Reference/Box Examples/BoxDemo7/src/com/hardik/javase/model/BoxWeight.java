package com.hardik.javase.model;

/**
 * Class Box Weight
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxWeight extends Box {

	private float weight;

	public BoxWeight() {
		super();
		this.weight = 0.0f;
	}

	BoxWeight(double len, float weight) {
		super(len);
		this.weight = weight;
	}

	BoxWeight(double width, double height, double depth, float weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	BoxWeight(BoxWeight bw) {
		super(bw);
		this.weight = bw.weight;
	}

	/**
	 * Print box information
	 */
	public void getBoxInfo() {
		System.out.println("Volume: " + super.volume());
		System.out.println("Box Weight: " + this.weight);
	}

	@Override
	public String toString() {
		return "BoxWeight [weight=" + this.weight + "]";
	}
}
