package de.andrena.junit.v3v4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NewTestCase { // Keine Vererbung!
	@Before public void createSomething() {
		// Namen sind beliebig
	}
	@Before public void initializeSomethingElse() {
		// Mehrere 'setUp'-Methoden erlaubt
	}
	@Test public void shouldTestSomething() {
		// Testmethoden dürfen ebenfalls beliebig heißen
	}
	@After public void cleanUp() {
		// Aufräumen nach jedem Test, mehrere zugelassen
	}
}
