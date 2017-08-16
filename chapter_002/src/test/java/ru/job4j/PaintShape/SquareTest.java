package ru.job4j.PaintShape;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void buildSquare() {
        Square square = new Square();
        assertEquals(square.pic(),"++++\r\n++++\r\n++++\r\n");
    }
}
