package com.euler.vaddin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPrimeFactor {

	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?
	 * 
	 * @param number
	 * @return
	 */
	public static int getLargestPrimeFactor(long number) {

		List<Integer> numbers=new ArrayList<Integer>();
		for (long i = number; i != 1; i--) {

			for (int j = 2; j <= number; j++) {
				if (number % j == 0) {
					number = number / j;
//					System.out.println(j);
					numbers.add(j);
					break;
				}
			}
		}

		return getMximumNumber(numbers);
	}
	
	public  static int getMximumNumber(List<Integer> numbers)
	{
		Collections.sort(numbers);
		return numbers.get(numbers.size()-1);
	}

	public static void main(String[] args) {
		System.out.println(LargestPrimeFactor.getLargestPrimeFactor(600851475143L));
	}

}
