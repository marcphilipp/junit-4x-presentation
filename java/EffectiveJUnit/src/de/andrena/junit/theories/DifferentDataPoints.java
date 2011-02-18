package de.andrena.junit.theories;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DifferentDataPoints {

	@DataPoint public static String A = "a";
	@DataPoint public static String B = "b";
	@DataPoints public static int[] NUMBERS = { 1, 2, 3 };

	@Theory public void theory1(String string) {
		/* ("a"), ("b") */
	}
	@Theory public void theory2(int number) {
		/* (1), (2), (3) */
	}
	@Theory public void theory3(String string, int number) {
		/* ("a", 1), ("a", 2), ("a", 3), ("b", 1), ("b", 2), ("b", 3) */
	}
}
