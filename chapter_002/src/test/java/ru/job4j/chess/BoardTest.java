package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

	@Test
    public void boardChess() {
	    Board board = new Board();
	    assertThat(board.filling(), is("D3"));
    }

    @Test
	public void runFigures() {
		Figures figures = new Figures();
		String result = figures.run();
		assertThat(result, is("H3"));
	}
}
