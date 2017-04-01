package com.euler.vaadin;

public class DigitFactorials {
	/**
	 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
	 * 
	 * Find the sum of all numbers which are equal to the sum of the factorial
	 * of their digits.
	 * 
	 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
	 * 
	 * @param args
	 */

	public static long factorial(long num) {
		if (num == 1 || num == 0)
			return 1;
		return num * factorial(num - 1);
	}

	public static long getCurious(int num) {
		long sum = 0;
		String tx = String.valueOf(num);
		for (int i = 0; i < tx.length(); i++) {
			int numBef = Integer.parseInt(tx.charAt(i) + "");
			long fact = factorial(numBef);
			sum += fact;
		}
		return sum;
	}

	public static int getFactDigit(int num) {
		
		
		if (getCurious(num) == num)
			System.out.println("asd");

		return 0;
	}

	public static void main(String[] args) {
//		factorial(24);
		getFactDigit(145);
	}

}
