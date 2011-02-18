package de.andrena.junit.hamcrest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BetterReadability {
	
	@Test public void withoutMatchers() {
		assertEquals(2, 1 + 1);
	}
	
	@Test public void withMatchers() {
		assertThat(1 + 1, is(2));
	}
}
