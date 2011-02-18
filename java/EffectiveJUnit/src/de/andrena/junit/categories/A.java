package de.andrena.junit.categories;

import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A {
	@Test
	public void a() {
		fail();
	}

	@Category(Slow.class)
	@Test
	public void test() {}
}
