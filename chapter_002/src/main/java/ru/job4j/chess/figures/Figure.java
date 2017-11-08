package ru.job4j.chess.figures;

import ru.job4j.chess.exception.ImpossibleMoveException;

public abstract class Figure {

	protected Figure() {
	}

	/**
	 * Method way Ставит условия, по которым фигура может ходить.
	 * @param oldPosition - Позиция фигуры до хода.
	 * @param newPosition - Позиция фигуры после хода.
	 * @return true - Возвращает истину, если все условия соблюдены.
	 */

	/*
	i - A B C D E F G H
	J - 1 2 3 4 5 6 7 8
	 */

	abstract public boolean way(String oldPosition, String newPosition) throws ImpossibleMoveException;

	public abstract String getPosition();
	public abstract String getName();
	public abstract void setPosition(String position);
}