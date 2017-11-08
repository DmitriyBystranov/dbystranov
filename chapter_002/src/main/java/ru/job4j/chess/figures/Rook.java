package ru.job4j.chess.figures;

import ru.job4j.chess.exception.ImpossibleMoveException;

public class Rook extends Figure {


    private String position;
    private String name;

    public Rook(String position, String name) {
        this.position = position;
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    @Override
    public String getName() {
        return String.valueOf(this.name);
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    /*
    if Меняется только одна из 2-х координат.
     */

    @Override
    public boolean way(String oldPosition, String newPosition) {
        if(oldPosition.charAt(0) == newPosition.charAt(0) || oldPosition.charAt(1) == newPosition.charAt(1)) {
            setPosition(newPosition);
            return true;
        } else {
            return false;
        }
    }
}
