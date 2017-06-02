package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial facTest1 = new Factorial();
		int result = facTest1.calc(5);
		int exspected = 120;
		assertThat(result, is(exspected));
	}
	
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial facTest2 = new Factorial();
		int result = facTest2.calc(0);
		int exspected = 1;
		assertThat(result, is(exspected));
	}
}