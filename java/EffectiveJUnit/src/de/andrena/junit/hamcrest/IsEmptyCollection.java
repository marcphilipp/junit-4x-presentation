package de.andrena.junit.hamcrest;

import java.util.Collection;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class IsEmptyCollection extends TypeSafeMatcher<Collection<?>> {

	@Override protected boolean matchesSafely(Collection<?> collection) {
		return collection.isEmpty();
	}

	@Override public void describeTo(Description description) {
		description.appendText("empty");
	}

	@Factory public static Matcher<Collection<?>> empty() {
		return new IsEmptyCollection();
	}
}
