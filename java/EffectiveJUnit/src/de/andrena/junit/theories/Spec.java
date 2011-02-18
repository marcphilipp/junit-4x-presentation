package de.andrena.junit.theories;

import java.util.List;

class Spec {
	public final long input;
	public final List<Integer> result;

	public Spec(long number, List<Integer> expectedResult) {
		this.input = number;
		this.result = expectedResult;
	}

}