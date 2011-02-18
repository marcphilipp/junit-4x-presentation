package de.andrena.junit.stringreplicator;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringReplicatorTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void replicateMultiCharacterTemplate() {
		StringReplicator replicator = new StringReplicator("=-");
		assertEquals("", replicator.replicate(0));
		assertEquals("=-=-=-", replicator.replicate(3));
	}

	@Test
	public void replicateEmptyTemplate() {
		assertEquals("", new StringReplicator("").replicate(3));
	}

	@Test
	public void throwsExceptionOnNullTemplate() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("template is null");
		new StringReplicator(null);
	}

	@Test
	public void throwsExceptionOnNegativeMultiplicator() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("multiplicator < 0");
		new StringReplicator("").replicate(-1);
	}
}
