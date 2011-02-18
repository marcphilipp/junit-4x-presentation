package de.andrena.junit.hamcrest;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class WithoutMatchers {

	@Test public void doesNotContain2() {
		assertFalse(asList(1, 2, 3).contains(2));
	}

}
