package primeNumbers;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class PrimeNumbersTest
{
	PrimeNumbers primeNumbers = new PrimeNumbers();

	@Test
	public void factorsOfOne()
	{
		assertEquals(Arrays.asList(), primeNumbers.primeFactorsOf(1));
	}
	
	@Test
	public void factorsOfTwo()
	{
		assertEquals(Arrays.asList(2), primeNumbers.primeFactorsOf(2));
	}

}
