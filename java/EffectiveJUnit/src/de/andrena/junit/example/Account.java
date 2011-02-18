package de.andrena.junit.example;

public class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public boolean isOverdrawn() {
		return balance < 0;
	}

	@Override public String toString() {
		return "Account<balance=" + balance + ">";
	}

}