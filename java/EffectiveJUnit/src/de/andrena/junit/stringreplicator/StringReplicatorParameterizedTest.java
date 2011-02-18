package de.andrena.junit.stringreplicator;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringReplicatorParameterizedTest {

	@Parameters
	public static List<Object[]> data() {
		return asList(new Object[][] { { "", -1 }, { "", 0 }, { "", 1 },
				{ "", 2 }, { "", 3 }, { "=", -1 }, { "=", 0 }, { "=", 1 },
				{ "=", 2 }, { "=", 3 }, { "=-", -1 }, { "=-", 0 }, { "=-", 1 },
				{ "=-", 2 }, { "=-", 3 } });
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private final String template;
	private final int value;

	public StringReplicatorParameterizedTest(String template, int value) {
		this.template = template;
		this.value = value;
	}

	@Test
	public void lengthShouldBeTemplateLengthTimesMultiplicator() {
		assumeTrue(value >= 0);
		String result = new StringReplicator(template).replicate(value);
		assertEquals(template.length() * value, result.length());
	}

	@Test
	public void replicationEqualsShorterReplicationConcatenatedWithTemplate() {
		assumeTrue(value > 0);
		StringReplicator replicator = new StringReplicator(template);
		String expected = replicator.replicate(value - 1) + template;
		String actual = replicator.replicate(value);
		assertEquals(expected, actual);
	}

	@Test
	public void throwsExceptionOnNullTemplate() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("template is null");
		new StringReplicator(null);
	}

	@Test
	public void throwsExceptionOnNegativeMultiplicator() {
		assumeTrue(value < 0);
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("multiplicator < 0");
		new StringReplicator(template).replicate(value);
	}
}
