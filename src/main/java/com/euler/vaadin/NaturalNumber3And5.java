package com.euler.vaadin;

public class NaturalNumber3And5 {
	/**
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23. 233168 Find the
	 * sum of all the multiples of 3 or 5 below 1000.
	 */

	public static int getSum(int limitedNumber, int... nums) {
		int sum = 0;

		for (int i = 3; i < limitedNumber; i++) {

			for (int j = 0; j < nums.length; j++) {
				if (i % nums[j] == 0) {
					sum += i;
					break;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(NaturalNumber3And5.getSum(1000, 3, 5));
	}

}
