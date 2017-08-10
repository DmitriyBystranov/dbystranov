package ru.job4j.PaintShape;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void buildTriangle() {
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        Triangle triangle = new Triangle();
        System.setOut(new PrintStream(out));
        triangle.pic();
        assertThat(out.toString(), is(String.format("  ^  \n ^^^ \n^^^^^", System.getProperty("line.separator"))));
    }
}
