package com.euler.vaddin;

public class LargestpalindromeProduct {

	/**
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * 997799
	 * 
	 * @param args
	 */

	public static int getLargestPalindromic() {
		int max = 100001;

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				int p = i * j;
				if (max < p && isPalindromic(p)) {
					max = p;
				}
			}
		}
		return max;
	}

	public static boolean isPalindromic(int number) {
		String num = String.valueOf(number);
		boolean flag = false;
		if (num.length() % 2 == 0)
			for (int i = 0; i < num.length() / 2; i++) {
				if (num.charAt(i) == num.charAt(num.length() - 1 - i))
					flag = true;
				else
				{
					flag = false;
					break;
				}
			}

		return flag;
	}

	public static void main(String[] args) {
//		System.out.println(isPalindromic(990009));
		System.out.println(getLargestPalindromic());
	}

}
