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
		String originString = "Madagaskar"; // Передаём аргумент в параметры.
		String testString = "aga";
		boolean verify = true; // Объявляем "ожидаемую" переменную.
		assertThat(Podstr.contains(originString, testString), is(verify)); // Сравниваем ожидаемую переменную с полученным результатом программы.
	}
}