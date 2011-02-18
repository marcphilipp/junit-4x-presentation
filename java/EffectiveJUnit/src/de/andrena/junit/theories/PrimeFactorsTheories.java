package de.andrena.junit.theories;

import static java.util.Arrays.asList;
import static java.util.Collections.nCopies;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PrimeFactorsTheories {

	private static final int EXPONENT = 31;

	@DataPoints
	public static final Spec[] DATA_POINTS = {
			new Spec(1, new ArrayList<Integer>()), new Spec(2, asList(2)),
			new Spec(3, asList(3)), new Spec(4, asList(2, 2)),
			new Spec(5, asList(5)), new Spec(6, asList(2, 3)),
			new Spec((long) Math.pow(2, EXPONENT), nCopies(EXPONENT, 2)), };

	private PrimeFactorizer factorizer = new PrimeFactorizer();

	@Theory
	public void checkPrimeFactors(Spec toCheck) {
		List<Integer> factors = factorizer.primeFactorsOf(toCheck.input);
		assertEquals(toCheck.result, factors);
	}
}
