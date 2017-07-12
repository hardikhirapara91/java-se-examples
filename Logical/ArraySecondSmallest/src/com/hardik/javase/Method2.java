package com.hardik.javase;

import java.util.Arrays;

/**
 * Second Method to find second smallest number
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Method2 implements SecondSmallest {

	@Override
	public void findSecondSmallest(int[] numbers) {

		Arrays.sort(numbers);

		System.out.println("Smallest: " + numbers[0]);
		System.out.println("Second Smallest: " + numbers[1]);
	}

}
