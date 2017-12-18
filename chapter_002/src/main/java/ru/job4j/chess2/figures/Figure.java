package ru.job4j.chess2.figures;

import ru.job4j.chess2.Cell;
import ru.job4j.chess2.exception.ImpossibleMoveException;

public abstract class Figure {
    public final Cell position;

    public int[] coordinates = new int[2];

    protected Figure(Cell position) {
        this.position = position;
    }
    public abstract Figure copy(Cell dest);


    //abstract Cell[][] way(Cell[] dist, Cell[] source) throws ImpossibleMoveException;
}