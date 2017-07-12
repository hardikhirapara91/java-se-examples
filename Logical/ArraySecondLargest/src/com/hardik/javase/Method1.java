package com.hardik.javase;

/**
 * First Method
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Method1 implements SecondLargest {

	/**
	 * Find Second Largest
	 */
	@Override
	public void findSecondLargest(int[] numbers) {

		int higest = 0;
		int secondHigest = 0;

		for (int number : numbers) {

			if (number > higest) {
				secondHigest = higest;
				higest = number;
			} else if (number > secondHigest) {
				secondHigest = number;
			}
		}

		System.out.println("Highest: " + higest);
		System.out.println("Second Highest: " + secondHigest);
	}
}
