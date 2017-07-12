package com.hardik.javase;

import com.hardik.javase.model.Box;
import com.hardik.javase.model.BoxWeight;

/**
 * Box Demo with Inheritance
 * @author HARDIK HIRAPARA
 *
 */
public class BoxDemo5 {

	public static void main(String[] args) {

		BoxWeight bw = new BoxWeight(12.600, 23.890, 34.90, 55.66);
		
		System.out.println("Box Width: " + bw.getBoxWidth());
		System.out.println("Volume: " + bw.volume());
		
		// Assign BoxWeight reference to Box reference
		Box box = new Box();
		box = bw;
		
		System.out.println(box);
		System.out.println("Volume: " + box.volume());
		
		// The following statement is invalid because getBoxWidth method does not define in box class.
		// System.out.println("Box Width: " + box.getBoxWidth());
	}
}
