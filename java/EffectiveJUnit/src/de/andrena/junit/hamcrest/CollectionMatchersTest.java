package de.andrena.junit.hamcrest;

import static de.andrena.junit.hamcrest.IsEmptyCollection.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import java.util.TreeSet;
import org.junit.Test;

public class CollectionMatchersTest {

	@Test public void isEmpty() {
		TreeSet<String> set = new TreeSet<String>();
		assertThat(set, new IsEmptyCollection());   // direkter Aufruf
		assertThat(set, IsEmptyCollection.empty()); // über @Factory-Methode
		assertThat(set, empty());                   // mit statischem Import
		assertThat(set, is(empty()));               // syntactic sugar
	}
}
