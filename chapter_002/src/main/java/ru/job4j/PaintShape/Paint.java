package ru.job4j.PaintShape;

public class Paint {

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String draw() {
        return shape.pic();
    }
}
