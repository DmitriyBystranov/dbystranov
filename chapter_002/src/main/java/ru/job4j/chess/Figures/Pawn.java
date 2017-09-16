package ru.job4j.chess.Figures;

public class Pawn extends Figure {
    private String coordinate;
    private String name;

    public Pawn(String coordinate, String name) {
        this.coordinate = coordinate;
        this.name = name;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getCoordinate() {
        return this.coordinate;
    }

    @Override
    void movementRules() {

    }
}