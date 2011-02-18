package de.andrena.junit.v3v4;

public class OldTestCase extends junit.framework.TestCase {
	@Override public void setUp() {
		// Initialisierung vor jedem Test
	}
	public void testSomething() {
		// Ein Test
	}
	@Override public void tearDown() {
		// Aufräumen nach jedem Test
	}
}
