package com.hardik.javase;

/**
 * Sum of provided numbers
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SumOfProvidedNumbers {

	/**
	 * Static Class SumThread
	 * 
	 * @author HARDIK HIRAPARA
	 *
	 */
	static class SumThread extends Thread {
		private int no;

		public SumThread(int no) {
			this.no = no;
		}

		/**
		 * Print sum of provided numbers
		 */
		@Override
		public void run() {
			int sum = 0;

			for (int i = 0; i <= no; i++) {
				sum += i;
			}

			System.out.printf("\nSum of numbers from 1 to %d is = %d", no, sum);

		}
	}

	public static void main(String[] args) {

		int[] num = { 20, 500, 100, 11000, 278450 };

		for (int i : num) {
			new SumThread(i).start();
		}
	}
}
