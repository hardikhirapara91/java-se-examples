package com.hardik.javase;

/**
 * Find Smallest Number from Array
 * 
 * @author silent
 *
 */
public class SecondSmallestFromArray {

	public static void main(String[] args) {

		int[] numbers = { 10, 11, 12, -40, 13, 14, 6, 3, -1 };

		Method1 m1 = new Method1();
		m1.findSecondSmallest(numbers);

		Method2 m2 = new Method2();
		m2.findSecondSmallest(numbers);
	}

}
