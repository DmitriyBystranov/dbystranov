package ru.job4j.chess2.figures;

import ru.job4j.chess2.Cell;
import ru.job4j.chess2.exception.ImpossibleMoveException;

public abstract class Figure {
    public final Cell position;

    protected Figure(Cell position) {
        this.position = position;
    }

    public int[] coordinates(Cell position) {
        return int[] coordinates = position.getX(), position.getY;
    }

    abstract Cell[][] way(Cell[] dist, Cell[] source) throws ImpossibleMoveException;
}
