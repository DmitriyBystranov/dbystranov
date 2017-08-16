package ru.job4j.PaintShape;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void buildTriangle() {
        Triangle triangle = new Triangle();
        assertEquals(triangle.pic(), "  ^  \r\n ^^^ \r\n^^^^^");
    }
}
