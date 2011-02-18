package de.andrena.junit.fest;

import org.fest.assertions.Condition;
import de.andrena.junit.example.Account;

public class IsOverdrawn extends Condition<Object> {
	
	public IsOverdrawn() {
		super("overdrawn");
	}

	@Override public boolean matches(Object object) {
		return ((Account) object).isOverdrawn();
	}

	public static IsOverdrawn overdrawn() {
		return new IsOverdrawn();
	}
	
}