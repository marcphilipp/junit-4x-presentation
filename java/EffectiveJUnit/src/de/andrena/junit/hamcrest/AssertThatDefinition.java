package de.andrena.junit.hamcrest;

import org.hamcrest.Matcher;

public abstract class AssertThatDefinition {

	public static <T> void assertThat(T actual, Matcher<T> matcher) {
		// ...
	}
	
	public static <T> void assertThat(String reason, T actual,
			Matcher<T> matcher) {
		// ...
	}

}
