package de.andrena.junit.fest;

import static de.andrena.junit.fest.AccountAssert.assertThat;
import static de.andrena.junit.fest.IsOverdrawn.overdrawn;
import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;
import de.andrena.junit.example.Account;

public class TestUsingFEST {

	@Test public void string() {
		assertThat("Hello World").contains("Hello");
	}

	@Test public void accountMitCustomCondition() {
		assertThat(new Account(-1)).satisfies(overdrawn());
	}

	@Test public void accountMitCustomCondition_failing() {
		assertThat(new Account(1)).satisfies(overdrawn());
	}

	@Test public void accountMitCustomAssertion() {
		assertThat(new Account(-1)).isOverdrawn();
	}

	@Test public void accountMitCustomAssertion_failing() {
		assertThat(new Account(1)).isOverdrawn();
	}

}
