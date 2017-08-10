package ru.job4j.PaintShape;

public class Square implements Shape {

    @Override
    public String pic() {
        StringBuilder square = new StringBuilder();
        String brick = "++++\r\n";
        square.append(brick + brick + brick);
        return square.toString();
    }
}
