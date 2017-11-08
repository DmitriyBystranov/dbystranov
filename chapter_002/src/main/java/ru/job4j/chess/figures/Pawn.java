package ru.job4j.chess.figures;

public class Pawn extends Figure {
    private String position;
    private String name;

    public Pawn(String position, String name) {
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
    if i == i(old) and j > j(old) and j <= j(old) + 2       --> true.
    P.S. Знаю, что не указал ещё нюанс с одношаговым ходом после первого хода. Если надо будет, сделаю.
     */

    @Override
    public boolean way(String oldPosition, String newPosition) {
        if(oldPosition.charAt(0) == newPosition.charAt(0) && oldPosition.charAt(1) < newPosition.charAt(1) && newPosition.charAt(1) <= oldPosition.charAt(1) + 2) {
            setPosition(newPosition);
            return true;
        } else {
            return false;
        }
    }
}