package ru.job4j.chess.figures;

import ru.job4j.chess.exception.ImpossibleMoveException;

public class King extends Figure {

    private String position;
    private String name;

    public King(String position, String name) {
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
    if i - i(old) = 1 по модулю or j - j(old) = 1 по модулю  --> true.
     */

    @Override
    public boolean way(String oldPosition, String newPosition) {
        if(Math.abs(oldPosition.charAt(0) - newPosition.charAt(0)) == 1 || Math.abs(oldPosition.charAt(1) - newPosition.charAt(1)) == 1) {
            setPosition(newPosition);
            return true;
        } else {
            return false;
        }
    }
}