package ru.job4j.PaintShape;

public class Triangle implements Shape {
    @Override
    public String pic() {
        StringBuilder triangle = new StringBuilder();
        String down = "\r\n";
        triangle.append("  ^  "+ down + " ^^^ " + down + "^^^^^");
        return triangle.toString();
    }
}
