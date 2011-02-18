package de.andrena.junit.rules;

import org.junit.rules.ExternalResource;

public class SystemProperty extends ExternalResource {
	private final String key, value;
	private String oldValue;
	public SystemProperty(String key, String value) {
		this.key = key;
		this.value = value;
	}
	@Override protected void before() {
		oldValue = System.getProperty(key);
		System.setProperty(key, value);
	}
	@Override protected void after() {
		if (oldValue == null) {
			System.getProperties().remove(key);
		} else {
			System.setProperty(key, oldValue);
		}
	}
}
