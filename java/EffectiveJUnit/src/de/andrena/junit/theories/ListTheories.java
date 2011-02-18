package de.andrena.junit.theories;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ListTheories {

	@DataPoint
	public static List<String> createArrayList() {
		return new ArrayList<String>(Arrays.asList(ITEMS));
	}

	@DataPoint
	public static List<String> createLinkedList() {
		return new LinkedList<String>();
	}

	@DataPoints
	public static String[] ITEMS = { "foo", "bar", null };

	@Theory(nullsAccepted = false)
	public void shouldContainPreviouslyAddedItems(List<String> list, String item) {
		// assumeThat(item, notNullValue());
		System.out.println(list + ", " + item);
		list.add(item);
		assertTrue(list.contains(item));
		assertSame(item, list.get(list.size() - 1));
	}

}
