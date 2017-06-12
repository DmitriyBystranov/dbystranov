package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
/**
	add test.
*/
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		int[] mass = {12, 2, 43, 4, 32, 21, 7};
		int[] expected = {2, 4, 7, 12, 21, 32, 43};
		String newLine1 = System.getProperty("line.separator");
		BubbleSort.sort(mass);
		assertThat(mass, is(expected));
	}
}