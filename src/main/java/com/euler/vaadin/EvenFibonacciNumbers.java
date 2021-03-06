package com.euler.vaadin;

public class EvenFibonacciNumbers {

	/*
	 * Each new term in the Fibonacci sequence is generated by adding the
	 * previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * By considering the terms in the Fibonacci sequence whose values do not
	 * exceed four million, find the sum of the even-valued terms.
	 */

	public static long getEvenFibonacciNumbers(int num) {
		long sum = 0;
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 2; i < num; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			if (n3 % 2 == 0)
			{
				if(sum<num)
				sum += n3;
				else
					break;
			}
		}
		return sum;
	}


	public static void main(String[] args) {
//		getSumFib();
		System.out.println(EvenFibonacciNumbers.getEvenFibonacciNumbers(4000000));
	}

}
// -1833689714