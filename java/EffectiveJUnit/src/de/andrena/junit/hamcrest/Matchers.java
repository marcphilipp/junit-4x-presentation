// Generated source.
package de.andrena.junit.hamcrest;

import java.util.Collection;
import org.hamcrest.Matcher;

public class Matchers {
	public static <T> Matcher<? super T> is(T param1) {
		return org.hamcrest.core.Is.is(param1);
	}
	/* ... */
	public static Matcher<Collection<?>> empty() {
		return de.andrena.junit.hamcrest.IsEmptyCollection.empty();
	}
}
