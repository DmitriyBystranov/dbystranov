package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
	Test program "Max".

	@author DmitriyBystranov (mailto: dbystranov@mail.ru)
	@version 1.0
	@since 30.05.2017
*/

public class MaxTest {

	/**
		Test add.
	*/

    @Test
    public void whenAddOnePlusOneThenTwo() {
        MaxTest maxTest = new MaxTest();
        int result = maxTest.max(1, 2);
        int expected = 2;
        assertThat(result, is(expected));
	}
}