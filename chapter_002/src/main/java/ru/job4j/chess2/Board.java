package ru.job4j.chess2;

import ru.job4j.chess2.exception.FigureNotFoundException;
import ru.job4j.chess2.exception.ImpossibleMoveException;
import ru.job4j.chess2.exception.OccupiedWayException;
import ru.job4j.chess2.figures.Figure;

public class Board {

    private Figure[] figures = new Figure[16];

    public boolean emptyOrRich(Cell dist) throws OccupiedWayException {
        for(Figure figure : figures) {
            if(figure.position.getX() == dist.getX() && figure.position.getY() == dist.getY()) {
                throw new OccupiedWayException("1");
            }
        }
        return true;
    }

    public void add (Figure figure) {
        int numberFigure = 0;
        figures[numberFigure] = figure;
        numberFigure++;
    }

    public boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        return true;
    }
}
