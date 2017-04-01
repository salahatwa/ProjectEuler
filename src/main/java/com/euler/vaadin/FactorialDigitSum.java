package com.euler.vaadin;


public class FactorialDigitSum {
	
	public static long factorial(long num)
	{
		if(num==1||num==0)
			return 1;
		return num*factorial(num-1);
	}
	
	public static long getSumOfDigits(int numbers)
	{
		int sum=0;
		String num=String.valueOf(numbers);
		for (int i = 0; i < num.length(); i++) {
			int digit=Integer.parseInt(String.valueOf(num.charAt(i)));
			sum+=digit;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
//		System.out.println(factorial(100));
		System.out.println(getSumOfDigits(3628800));
	}

}
