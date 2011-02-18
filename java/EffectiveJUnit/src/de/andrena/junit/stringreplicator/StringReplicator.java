package de.andrena.junit.stringreplicator;

public class StringReplicator {

	private final String template;

	public StringReplicator(String template) {
		if (template == null) {
			throw new IllegalArgumentException("template is null");
		}
		this.template = template;
	}

	public String replicate(int multiplicator) {
		if (multiplicator < 0) {
			throw new IllegalArgumentException("multiplicator < 0");
		}
		StringBuilder result = new StringBuilder(multiplicator
				* template.length());
		for (int counter = 0; counter < multiplicator; counter++) {
			result.append(template);
		}
		return result.toString();
	}

}
