package ru.job4j.chess2.figures;

import ru.job4j.chess2.Cell;
import ru.job4j.chess2.exception.ImpossibleMoveException;

public class Bishop extends Figure {

    protected Bishop(Cell position) {
        super(position);
    }


    @Override
    public Figure copy(Cell dest) {
        return new Bishop(dest);
    }

    @Override
    public Cell[] way(Cell dest, Cell source) throws ImpossibleMoveException {



        if(Math.abs(dest.getX() - source.getX()) ==
                Math.abs(dest.getY() - source.getY())) {
            int i = 0;
            int j = 0;
            if(dest.getX() > source.getX()) {
                i = source.getX();
            } else {
                i = dest.getX();
            }

            if(d)
        } else {
            throw new ImpossibleMoveException("The figure does not go."); // Создаётся объект.
        }
    }
}
