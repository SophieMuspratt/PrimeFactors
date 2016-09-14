package primeNumbers;

import java.util.ArrayList;
import java.util.List;


public class PrimeNumbers
{

	public List<Integer> primeFactorsOf(int prime)
	{
		List<Integer> primeList = new ArrayList<>();
		
		if (prime % 2 == 0){
			primeList.add(prime);
		}
		
		if (prime % 3 == 0){
			primeList.add(prime);
		}	
		
		return primeList;

	}

}
