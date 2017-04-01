package com.euler.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.euler.vaddin.NaturalNumber3And5;

public class ProblemsTest {

	/**
	 * First Euler Problem
	 */
	@Test
	public void naturalNumber3And5() {
		int sum=NaturalNumber3And5.getSum(1000, 3,5);
		assertEquals(233168, sum);
		int sum2=NaturalNumber3And5.getSum(10, 3,5);
		assertEquals(23, sum2);
	}
	
	
	

}
