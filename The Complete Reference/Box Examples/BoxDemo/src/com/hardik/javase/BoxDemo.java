package com.hardik.javase;

/**
 * BoxDemo Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxDemo {

	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box();

		b1.setVolumn(12, 90, 77);
		b2.setVolumn(90, 88, 66);

		b1.getVolumn();
		b2.getVolumn();

	}

}
