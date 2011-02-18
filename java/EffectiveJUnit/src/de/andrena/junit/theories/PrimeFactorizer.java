package de.andrena.junit.theories;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactorizer {

	public List<Integer> primeFactorsOf(long number) {
		return primeFactorsOf(number, 2, new LinkedList<Integer>());
	}

	private List<Integer> primeFactorsOf(long number, int factor,
			LinkedList<Integer> result) {
		if (number == 1) {
			return result;
		}
		if (number % factor == 0) {
			result.add(factor);
			return primeFactorsOf(number / factor, factor, result);
		}
		return primeFactorsOf(number, factor + 1, result);
	}

}
