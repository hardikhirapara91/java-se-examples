package com.hardik.javase;

/**
 * BoxDemo4
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxDemo4 {

	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box(10);
		Box b3 = new Box(10, 20, 30);
		Box b4 = new Box(b1);

		b1.volume();
		b2.volume();
		b3.volume();
		b4.volume();
	}

}
