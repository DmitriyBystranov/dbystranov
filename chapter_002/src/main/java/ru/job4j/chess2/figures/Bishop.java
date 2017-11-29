package ru.job4j.chess2.figures;

import ru.job4j.chess2.Cell;
import ru.job4j.chess2.exception.ImpossibleMoveException;

public class Bishop extends Figure {

    protected Bishop(Cell position) {
        super(position);
    }



    @Override
    public Cell[][] way(Cell[] dest, Cell[] source) throws ImpossibleMoveException {
        if(Math.abs(dest[0] - source[0]) ==
                Math.abs(dest[1] - source[1])) {
            setPosition(newPosition);
            return true;
        } else {
            return false;
        }
    }
}
