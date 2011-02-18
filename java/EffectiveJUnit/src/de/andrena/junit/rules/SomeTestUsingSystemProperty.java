package de.andrena.junit.rules;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Rule;
import org.junit.Test;

public class SomeTestUsingSystemProperty {
	
	private static final String VALUE = "someValue";
	private static final String KEY = "someKey";

	@Rule public SystemProperty systemProperty = new SystemProperty(KEY, VALUE);

	@Test public void test() {
		assertThat(System.getProperty(KEY), is(VALUE));
	}
}
