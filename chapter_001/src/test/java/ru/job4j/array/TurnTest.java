package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
/**
	add test.
*/
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] mass = {1, 2, 3, 4, 5, 6, 7};
		int[] expected = {7, 6, 5, 4, 3, 2, 1};
		String newLine1 = System.getProperty("line.separator");
		turn.back(mass);
		assertThat(mass, is(expected));
	}
/**
	add Test.
*/	
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] mass = {1, 2, 3, 4, 5, 6};
		int[] expected = {6, 5, 4, 3, 2, 1};
		String newLine1 = System.getProperty("line.separator");
		turn.back(mass);
		assertThat(mass, is(expected));
	}
}
