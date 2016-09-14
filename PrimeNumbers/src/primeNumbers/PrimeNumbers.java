package primeNumbers;

import java.util.ArrayList;
import java.util.List;


public class PrimeNumbers
{

	public List<Integer> primeFactorsOf(int prime)
	{
		ArrayList<Integer> primeList = new ArrayList<>();
		for(int factor = 2; factor <= prime; factor++){
			while (prime % factor == 0){
				primeList.add(factor);
				prime /= factor;
			}
		}
				
		return primeList;

	}

}
