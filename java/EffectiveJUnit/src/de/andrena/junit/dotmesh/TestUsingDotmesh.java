package de.andrena.junit.dotmesh;

import static org.dotmesh.Dotmesh.assertThat;
import org.junit.Test;
import de.andrena.junit.example.Account;

public class TestUsingDotmesh {

	@Test public void string() {
		assertThat("Hello World").contains("Hello");
	}

	@Test public void account() {
		assertThat(new Account(-1)).isOverdrawn();
	}

	@Test public void account_failing() {
		assertThat(new Account(1)).isOverdrawn();
	}

}
