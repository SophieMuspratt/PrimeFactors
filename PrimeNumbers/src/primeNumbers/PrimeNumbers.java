package primeNumbers;

import java.util.ArrayList;
import java.util.List;


public class PrimeNumbers
{

	public List<Integer> primeFactorsOf(int prime)
	{
		ArrayList<Integer> primeList = new ArrayList<>();
		
		while (prime % 2 == 0){
			primeList.add(2);
			prime /= 2;
		}
		
		if (prime % 3 == 0){
			primeList.add(prime);
		}	
		
		if (prime % 5 == 0){
			primeList.add(prime);
		}	
		
		return primeList;

	}

}
