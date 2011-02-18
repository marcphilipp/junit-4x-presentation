package de.andrena.junit.hamcrest;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;
import org.junit.Test;

public class WithMatchers {

	@Test public void doesNotContain2() {
		assertThat(asList(1, 2, 3), not(hasItem(2)));
	}

	@Test public void combinations() {
		assertThat(1 + 1, is(not(3)));
		assertThat(1 + 1, both(greaterThan(1)).and(lessThan(3)));
	}
}
