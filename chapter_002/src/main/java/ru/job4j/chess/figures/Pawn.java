package ru.job4j.chess.figures;

public class Pawn {
    private String coordinate;
    private String name;

    public Pawn(String coordinate, String name) {
        this.coordinate = coordinate;
        this.name = name;
    }

    public void setPosition(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getPosition() {
        return this.coordinate;
    }

    public void movementRules(String position, String oldPosition) {

    }
}