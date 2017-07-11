package com.hardik.javase;

/**
 * Compute Distance Light Travels
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class LightSpeedDistance {

	public static void main(String[] args) {

		int days = 365;
		long lightSpeed = 1_86_000;
		long second = days * 24 * 60 * 60;

		long distance = second * lightSpeed;

		System.out.println("Light traved in 1 year: " + distance);
	}
}
