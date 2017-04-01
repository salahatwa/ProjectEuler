package com.euler.vaddin;

public class SpecialPythagoreanTriplet {

	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * 
	 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 * 
	 * @param num
	 * @return
	 */
	public static int getPaythagorean(int num) {

		for (int i = 2; i < num; i++) {
			for (int j = 2; j < num; j++) {

				int a = (int) Math.pow(i, 2);
				int b = (int) Math.pow(j, 2);

				
				
				double sqrt = Math.sqrt(a+b);
				int x = (int) sqrt;
				if(Math.pow(sqrt,2) == Math.pow(x,2))
					{System.out.println(i+"::"+j+"\t"+a+"$"+b+":"+(a+b));break;}


			}
		}

		return 0;
	}



	public static void main(String[] args) {
		getPaythagorean(25);
	}

}
