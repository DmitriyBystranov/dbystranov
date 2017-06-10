package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
	* Test program "Paint".
	* @author Bystranov
	* @since 10.06.2017
	* @version 1.0
*/

public class PaintTest {
/**
	Test add.
*/
	@Test
	public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
		String newLine1 = System.getProperty("line.separator");
		Paint paint = new Paint();
		String result = paint.piramida(2);
		String expected = String.format(" ^ %s^^^", newLine1);
		assertThat(result, is(expected));
	}
/**
	Test add.
*/	
	@Test
	public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
		String newLine2 = System.getProperty("line.separator");
		Paint paint = new Paint();
		String result = paint.piramida(3);
		String expected = String.format(" ^ %s ^^^ %s^^^^^", newLine2);
		assertThat(result, is(expected));
	}
}
