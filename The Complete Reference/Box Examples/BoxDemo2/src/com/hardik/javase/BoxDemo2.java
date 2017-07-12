package com.hardik.javase;

/**
 * Box Demo2
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxDemo2 {

	public static void main(String[] args) {

		Box b1 = new Box();
		b1.setDimention(12, 45, 67);
		System.out.println("Volumn: " + b1.getBoxVolume());
	}
}
