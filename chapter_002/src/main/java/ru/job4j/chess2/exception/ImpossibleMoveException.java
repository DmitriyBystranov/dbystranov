package ru.job4j.chess2.exception;

public class ImpossibleMoveException extends RuntimeException {
    public ImpossibleMoveException(String message) {
        super(message);
    }
}
