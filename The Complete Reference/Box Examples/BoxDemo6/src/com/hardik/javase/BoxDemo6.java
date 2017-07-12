package com.hardik.javase;

import com.hardik.javase.model.BoxWidth;

/**
 * Box Demo Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxDemo6 {

	public static void main(String[] args) {

		BoxWidth bw = new BoxWidth(12.90, 90.78, 77.99, 100.900);

		System.out.println("Volume: " + bw.volume());
		System.out.println("Box Weight: " + bw.getBoxWeight());
	}
}
