package com.euler.sum;

public class SummationOfPrimes {

	public static boolean isPrime(int num) {
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public static long getPrimeSum(int num) {
		long sum = 0;
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getPrimeSum(2000000));
	}

}
