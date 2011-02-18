package de.andrena.junit.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Slow.class)
public class B {
	@Test
	public void c() {}
}
