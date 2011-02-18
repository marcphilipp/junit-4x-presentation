package de.andrena.junit.stringreplicator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;
import org.junit.Rule;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class StringReplicatorTheories {

	@DataPoints
	public static String[] TEMPLATES = { "", "=", "=-" };

	@DataPoints
	public static int[] VALUES = { -1, 0, 1, 2, 3 };

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Theory
	public void lengthIsMultipleOfMultiplicator(String template,
			int value) {
		assumeTrue(value >= 0);
		String result = new StringReplicator(template).replicate(value);
		assertEquals(template.length() * value, result.length());
	}

	@Theory
	public void lengthIsAlwaysZeroForZeroMultiplicator(String template) {
		String result = new StringReplicator(template).replicate(0);
		assertEquals(0, result.length());
	}

	@Theory
	public void replicationEqualsShorterReplicationConcatenatedWithTemplate(
			String template, int value) {
		assumeTrue(value > 0);
		StringReplicator replicator = new StringReplicator(template);
		String expected = replicator.replicate(value - 1) + template;
		String actual = replicator.replicate(value);
		assertEquals(expected, actual);
	}

	@Theory
	public void throwsExceptionOnNullTemplate() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("template is null");
		new StringReplicator(null);
	}

	@Theory
	public void throwsExceptionOnNegativeMultiplicator(String template,
			int value) {
		assumeTrue(value < 0);
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("multiplicator < 0");
		new StringReplicator(template).replicate(-1);
	}
}
