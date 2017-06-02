package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
	Test program "Point".

	@author Dmitriy
	@version 1.0
	@since 30.05.2017
*/

public class PointTest {

	/**
		Test add.
	*/
	@Test
	public void pointOnTheFunction() {
		Point pointTest = new Point(4, 10);
		boolean result  = pointTest.is(2, 2);
		boolean expected = true;
		assertThat(result, is(expected));
	}
}