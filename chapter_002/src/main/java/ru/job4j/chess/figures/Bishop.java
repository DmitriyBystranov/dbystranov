package ru.job4j.chess.figures;

public class Bishop extends Figure {
    private String position;
    private String name;

    public Bishop(String position, String name) {
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
    if i - i(old) по модулю = j - j(old) по модулю  --> true.
     */

    @Override
    public boolean way(String oldPosition, String newPosition) {

        if(Math.abs(oldPosition.charAt(0) - newPosition.charAt(0)) ==
                Math.abs(oldPosition.charAt(1) - newPosition.charAt(1))) {
            setPosition(newPosition);
            return true;
        } else {
            return false;
        }
    }
}
