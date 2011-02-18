package de.andrena.junit.fest;

import org.fest.assertions.AssertExtension;
import org.fest.assertions.Assertions;
import org.fest.assertions.ObjectAssert;
import de.andrena.junit.example.Account;

class AccountAssert extends ObjectAssert implements AssertExtension {

	private final Account account;

	public AccountAssert(Account account) {
		super(account);
		this.account = account;
	}

	public void isOverdrawn() {
		Assertions.assertThat(account.isOverdrawn()).as("overdrawn").isTrue();
	}

	public static AccountAssert assertThat(Account account) {
		return Assertions.assertThat(new AccountAssert(account));
	}

}