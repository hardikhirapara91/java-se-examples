package com.hardik.javase;

/**
 * Find Second Largest Number from Array
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ArraySecondLargest {

	public static void main(String[] args) {

		int[] numbers = { 45, 89, 63, 500, 45, 900 };

		Method1 method1 = new Method1();
		method1.findSecondLargest(numbers);

		// Method2 method2 = new Method2();
		// method2.findSecondLargest(numbers);
	}

}
