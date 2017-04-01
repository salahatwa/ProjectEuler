package com.euler.vaadin;

public class CoinSums {
	/**
	 * In England the currency is made up of pound, £, and pence, p, and there
	 * are eight coins in general circulation:
	 * 
	 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p). It is possible to
	 * make £2 in the following way:
	 * 
	 * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p How many different ways can £2
	 * be made using any number of coins?
	 * 
	 * @param args
	 */
	public static int getNUmberOfPossability(int[] inputs)
	{
		int sum=0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < inputs.length; j++) {
				sum+=inputs[j]*i;
			}
			
			if(sum==200)
				System.out.println(sum);
			sum=0;
		}
		return sum;
	}

	public static void main(String[] args) {
      int[] arr={1,2,5,10,20,50,100};
	   System.out.println(getNUmberOfPossability(arr));
	}

}
