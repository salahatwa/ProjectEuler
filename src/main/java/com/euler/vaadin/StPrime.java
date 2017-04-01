package com.euler.vaadin;

public class StPrime {
	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 * 
	 * @param args
	 */

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public static int getStPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				count++;
				if (count == 10001) {
					System.out.println(i + "::" + count);
					break;
				}
				

			}
		}
		return count;
	}

/*	public static int getPrimeST(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				count++;

			}
		}
		return count;
	}*/

	public static void main(String[] args) {
//		System.out.println(getStPrime(200004));
		System.out.println(getStPrime(1300002));
		// isPrime(6);
	}

}
