package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
	Test program "Calculator".

	@author DmitriyBystranov (mailto: dbystranov@mail.ru)
	@version 1.0
	@since 22.05.2017
*/

public class CalculatorTest {

	/**
		Test add.
	*/

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.plus(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

	/**
		Test add.
	*/

	public void whenAddOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.minus(5D, 1D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

	/**
		Test add.
	*/

	public void whenAddOneMultiplyOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiply(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }

	/**
		Test add.
	*/

	public void whenAddOneSharingOneThenTwo() {
        Calculator calc = new Calculator();
        calc.sharing(6D, 4D);
        double result = calc.getResult();
        double expected = 1.5D;
        assertThat(result, is(expected));
    }
}