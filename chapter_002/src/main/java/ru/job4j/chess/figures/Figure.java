package ru.job4j.chess.figures;

import ru.job4j.chess.exception.ImpossibleMoveException;

public abstract class Figure {
	private String position;
	private String name;

	public Figure(String position, String name) {
		this.position = position;
		this.name = name;
	}

	abstract void way() throws ImpossibleMoveException;
}