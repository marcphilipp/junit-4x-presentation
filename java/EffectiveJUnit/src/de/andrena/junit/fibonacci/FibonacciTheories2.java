package de.andrena.junit.fibonacci;

import static de.andrena.junit.fibonacci.Fibonacci.compute;
import static org.junit.Assert.assertEquals;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class FibonacciTheories2 {

	@Theory
	public void seeds(@TestedOn(ints = { 0, 1 }) int n) {
		assertEquals(n, compute(n));
	}

	@Theory
	public void recurrence(@TestedOn(ints = { 2, 3, 4, 5, 6 }) int n) {
		assertEquals(compute(n - 1) + compute(n - 2), compute(n));
	}
}
