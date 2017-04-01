package com.euler.vaddin;


public class SumSquareDifference {
	/**
	 * The sum of the squares of the first ten natural numbers is,
	 * 
	 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
	 * numbers is,
	 * 
	 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of
	 * the squares of the first ten natural numbers and the square of the sum is
	 * 3025 − 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one
	 * hundred natural numbers and the square of the sum.
	 */
	
	
	public static long getSumOfSquare(int limitNum)
	{
		long sum=0;
		for (int i = 1; i <= limitNum; i++) {
			sum+= Math.pow(i, 2);
		}
		
		return sum;
	}
	
	public static long getSquareOfSum(int limitNum)
	{
		long sum=0;
		for (int i = 1; i <= limitNum; i++) {
			sum+= i;
		}
		
		return (long) Math.pow(sum, 2);
	}
	
	public static void main(String[] args) {
		System.out.println(getSquareOfSum(100)-getSumOfSquare(100));
	}
}
