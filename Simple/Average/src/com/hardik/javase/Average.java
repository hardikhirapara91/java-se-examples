package com.hardik.javase;

/**
 * Find Average of Double value.
 * @author HARDIK HIRAPARA
 *
 */
public class Average {

	public static void main(String[] args) {
		
		double no[] = {12.34, 34.45, 45.56, 56.67, 67.78, 78.89, 89.90};
		double sum = 0.0;
		
		for (int i = 0; i < no.length; i++) {
			sum += no[i];
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (sum/no.length));
	}

}
