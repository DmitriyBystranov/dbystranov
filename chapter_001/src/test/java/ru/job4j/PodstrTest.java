package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PodstrTest {
/**
	add Test.
*/
	@Test
	public void whetherStringIsSubstring() {
		String originString = "Madagaskar";
		String testString = "aga";
		boolean verify = true;
		assertThat(Podstr.contains(originString, testString), is(verify));
	}
}