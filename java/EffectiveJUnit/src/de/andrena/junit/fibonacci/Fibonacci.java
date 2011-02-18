package de.andrena.junit.fibonacci;

public class Fibonacci {

	public static long compute(int n) {
		return n <= 1 ? n : compute(n - 1) + compute(n - 2);
	}

}
