package ru.job4j.chess.figures;

import ru.job4j.chess.exception.ImposibleMoveException;

public class Queen extends Figure{

    public Queen(String position, String name) {
        super(position, name);
    }

    @Override
    void way() throws ImposibleMoveException {

    }
}
