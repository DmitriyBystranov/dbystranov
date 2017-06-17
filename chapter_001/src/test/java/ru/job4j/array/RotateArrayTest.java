package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class RotateArrayTest {
/**
	add Test.
*/
	@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		int[][] arrayOrigin = {{1, 2},
							   {3, 4}};
		int[][] arrayCopy = new int[2][2];
		int[][] arrayExpected = {{3, 1},
							     {4, 2}};
		assertThat(RotateArray.rotate(arrayOrigin, arrayCopy), is(arrayExpected));
	}
/**
	add Test.
*/	
	@Test
	public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		int[][] arrayOrigin = {{1, 2, 3},
							   {4, 5, 6},
							   {7, 8, 9},};
		int[][] arrayCopy = new int[3][3];
		int[][] arrayExpected = {{7, 4, 1},
							     {8, 5, 2},
							     {9, 6, 3},};
		assertThat(RotateArray.rotate(arrayOrigin, arrayCopy), is(arrayExpected));
	}
}
