package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.plus(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	public void whenAddOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.minus(5D, 1D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
	
	public void whenAddOneMultiplyOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiply(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
	
	public void whenAddOneSharingOneThenTwo() {
        Calculator calc = new Calculator();
        calc.sharing(6D, 4D);
        double result = calc.getResult();
        double expected = 1.5D;
        assertThat(result, is(expected));
    }
}