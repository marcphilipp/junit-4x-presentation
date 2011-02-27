package de.andrena.junit.fibonacci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static de.andrena.junit.fibonacci.Fibonacci.compute;

@RunWith(Theories.class)
public class FibonacciTheories {

	@DataPoints public static int[] VALUES = { 0, 1, 2, 3, 4, 5, 6 };

	@Theory public void seeds(int n) {       // $F(0) = 0$, $F(1) = 1$
		assumeTrue(n <= 1);
		assertEquals(n, compute(n));
	}

	@Theory public void recurrence(int n) {  // $F(n) = F(n-1) + F(n-2)$ for $n>1$
		assumeTrue(n > 1);
		assertEquals(compute(n - 1) + compute(n - 2), compute(n));
	}
}
