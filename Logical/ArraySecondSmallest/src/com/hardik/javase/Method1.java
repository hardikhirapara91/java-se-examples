package com.hardik.javase;

/**
 * First method to find second smallest number.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Method1 implements SecondSmallest {

	@Override
	public void findSecondSmallest(int[] numbers) {

		int small = numbers[0];
		int sec_Small = numbers[0];

		// Find Smallest Number
		for (int i = 0; i < numbers.length; i++) {
			if (small > numbers[i]) {
				small = numbers[i];
			}
		}
		System.out.println("Smallest: " + small);

		// Find Second Smallest Number
		for (int i = 0; i < numbers.length; i++) {
			if (sec_Small > numbers[i] && numbers[i] != small) {
				sec_Small = numbers[i];
			}
		}

		System.out.println("Second Smallest: " + sec_Small);
	}

}
