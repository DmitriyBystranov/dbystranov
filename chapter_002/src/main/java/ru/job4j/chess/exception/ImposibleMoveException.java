package ru.job4j.chess.exception;

public class ImposibleMoveException extends RuntimeException {
    public ImposibleMoveException(String message) {
        super(message);
    }
}
