package com.euler.vaadin;

public class SmallestMultiple {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of
	 * the numbers from 1 to 20?
	 */

	public static boolean isDivisable(int num, int from, int to) {
		from = (from == 0) ? 1 : from;
		boolean flag = false;
		for (int j = 1; j <= num; j++) {

			for (int i = from; i <= to; i++) {
				if (j % i == 0) {
//					System.out.println(j + "::" + i);
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

		}
		return flag;

	}

	public static long getSmallestMultiple(long number, int from, int to) {
		long resultNumber = 0;

		for (int j = 1; j <= number; j++) {
			if (isDivisable(j, from, to))
				resultNumber = j;
		}
		return resultNumber;
	}

	public static void main(String[] args) {
		System.out.println(getSmallestMultiple(300000, 1, 20));
	}

}
