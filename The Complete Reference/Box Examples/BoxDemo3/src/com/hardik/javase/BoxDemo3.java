package com.hardik.javase;

/**
 * BoxDemo3
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BoxDemo3 {

	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box(10);
		Box b3 = new Box(10, 20, 30);

		b1.volume();
		b2.volume();
		b3.volume();
	}

}
