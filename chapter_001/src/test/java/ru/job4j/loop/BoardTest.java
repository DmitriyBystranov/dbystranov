package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
	
	@Test
	public void boardTest1() {
		Board board = new Board();
		String result = board.paint(3, 3);
		final String line = System.getProperty("line.separator");
		String expected = String.format("X X%s X %sX X%s", line, line, line);
		assertThat(result, is(expected));
	}
	
	@Test
	public void  boardTest2() {
		Board board = new Board();
		String result = board.paint(5, 4);
		final String line = System.getProperty("line.separator");
		String expected = String.format("X X X%s X X %sX X X%s X X ", line, line,line);
		assertThat(result, is(expected));
	}
}