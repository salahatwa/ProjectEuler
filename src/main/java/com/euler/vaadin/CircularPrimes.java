package com.euler.vaadin;

import java.util.ArrayList;
import java.util.List;

public class CircularPrimes {

	/**
	 * The number, 197, is called a circular prime because all rotations of the
	 * digits: 197, 971, and 719, are themselves prime.
	 * 
	 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37,
	 * 71, 73, 79, and 97.
	 * 
	 * How many circular primes are there below one million?
	 * 
	 * @param args
	 */

	public static boolean isPrime(long num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public static int getPrime(int num) {
		int count = 0;
		boolean flag = false;
		for (int i = 2; i <= num; i++) {
			List<Long> ns = rotateNumber(i);
			for (int k = 0; k < ns.size(); k++) {
				if (isPrime(ns.get(k))) {
					flag = true;
					
				} else {
					flag = false;
					break;
				}
			}
			if(flag==true)
			{
				count++;
			}

			flag = false;
		}
		return count;
	}

	
	public static List<Long> rotateNumber(long number) {
		List<Long> cercuilarNum = new ArrayList<Long>();
		long start = number;

		int numdigits = (int) Math.log10((double) number);
		int multiplier = (int) Math.pow(10.0, (double) numdigits);

		while (true) {
			long q = number / 10;
			long r = number % 10;

			number = number / 10;
			number = number + multiplier * r;

			cercuilarNum.add(number);

			if (number == start)
				break;
		}
		return cercuilarNum;
	}

	public static void main(String[] args) {
		System.out.println( getPrime(1000000) );
	}

}
