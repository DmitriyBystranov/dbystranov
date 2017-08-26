package ru.job4j.control_task;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TaskTest {
	
/*
	Add Test
*/
	@Test
	public void whenTwoArraysSumm() {
		int[] arrayOne = {23, 46, 84, 92, 376, 835};
		int[] arrayTwo = {2, 5, 128, 256, 344, 567};
		int[] trueArray = {2, 5, 23, 46, 84, 92, 128, 256, 344, 376, 567, 835};
		
		Task task = new Task();
		assertThat(task.mass(arrayOne, arrayTwo), is(trueArray));
	}
	
	
	@Test
	public void whenTwoArraysSumm2() {
		int[] arrayOne = {2, 5, 128, 256, 344, 567};
		int[] arrayTwo = {23, 46, 84, 92, 376, 835};
		int[] trueArray = {2, 5, 23, 46, 84, 92, 128, 256, 344, 376, 567, 835};
		
		Task task = new Task();
		assertThat(task.mass(arrayOne, arrayTwo), is(trueArray));
	}
	
	
	@Test
	public void whenTwoArraysSumm3() {
		int[] arrayOne = {2, 5, 128, 256, 376, 567};
		int[] arrayTwo = {23, 46, 84, 92, 376, 835};
		int[] trueArray = {2, 5, 23, 46, 84, 92, 128, 256, 376, 376, 567, 835};
		
		Task task = new Task();
		assertThat(task.mass(arrayOne, arrayTwo), is(trueArray));
	}
}
