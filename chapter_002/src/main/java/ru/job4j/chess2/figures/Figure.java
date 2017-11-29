package ru.job4j.chess2.figures;

import ru.job4j.chess2.Cell;
import ru.job4j.chess2.exception.ImpossibleMoveException;

public abstract class Figure {
    public final Cell position;

    protected Figure(Cell position) {
        this.position = position;
    }

    abstract Cell[][] way(Cell[] dist, Cell[] source) throws ImpossibleMoveException;
}
