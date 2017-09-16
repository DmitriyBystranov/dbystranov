package ru.job4j.chess.Figures;

public abstract class Figure {
	private String coordinate;
	private String name;
	abstract void movementRules();
}