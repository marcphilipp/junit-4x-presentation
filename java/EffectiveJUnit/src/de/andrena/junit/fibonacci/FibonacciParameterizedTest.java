package de.andrena.junit.fibonacci;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciParameterizedTest {

	@Parameters public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 },
				{ 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
	}

	private final int input, expected;

	public FibonacciParameterizedTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Test public void test() {
		assertEquals(expected, Fibonacci.compute(input));
	}
}
