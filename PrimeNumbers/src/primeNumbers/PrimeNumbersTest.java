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
	
	@Test
	public void factorsOfThree()
	{
		assertEquals(Arrays.asList(3), primeNumbers.primeFactorsOf(3));
	}
	
	@Test
	public void factorsOfFour()
	{
		assertEquals(Arrays.asList(2, 2), primeNumbers.primeFactorsOf(4));
	}
	
	@Test
	public void factorsOfFive()
	{
		assertEquals(Arrays.asList(5), primeNumbers.primeFactorsOf(5));
	}
	
	@Test
	public void factorsOfSix()
	{
		assertEquals(Arrays.asList(2, 3), primeNumbers.primeFactorsOf(6));
	}
	
	@Test
	public void factorsOfSeven()
	{
		assertEquals(Arrays.asList(7), primeNumbers.primeFactorsOf(7));
	}
	
	@Test
	public void factorsOfEight()
	{
		assertEquals(Arrays.asList(2, 2, 2), primeNumbers.primeFactorsOf(8));
	}
	
	@Test
	public void factorsOfNine()
	{
		assertEquals(Arrays.asList(3, 3), primeNumbers.primeFactorsOf(9));
	}
	
}
