package com.hardik.javase;

import java.util.Arrays;

/**
 * Second Method
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Method2 implements SecondLargest {

	@Override
	public void findSecondLargest(int[] numbers) {

		Arrays.sort(numbers);

		System.out.println("Highest: " + numbers[numbers.length - 1]);
		System.out.println("Second Highest: " + numbers[numbers.length - 2]);

	}

}
