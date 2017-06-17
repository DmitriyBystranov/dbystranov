package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class ArrayDuplicateTest {
/**
	add Test.
*/	
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		String[] mass = {"A","B","G","D","A","F","G"};
		String[] massExpected = {"A","B","G","D","F"};
		assertThat(ArrayDuplicate.remove(mass), is(massExpected));
	}
}
