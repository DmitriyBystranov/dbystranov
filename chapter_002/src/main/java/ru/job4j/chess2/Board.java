package ru.job4j.chess2;

import ru.job4j.chess2.exception.FigureNotFoundException;
import ru.job4j.chess2.exception.ImpossibleMoveException;
import ru.job4j.chess2.exception.OccupiedWayException;
import ru.job4j.chess2.figures.Figure;

public class Board {

    private Figure[] figures = new Figure[16];

    public boolean emptyOrRich(Cell source, Cell dist) {

    }

    public boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        return true;
    }
}
