package ru.job4j.chess;

import ru.job4j.chess.figures.*;

public class Play {
	private Figure[] figures = new Figure[16];
	private Board board = new Board();
	private ValidateInput input = new ValidateInput();

	/**
	 * Method placementFigures "Ставит фигуры на доску".
	 */
	public void placementFigures() {
		for(int i = 0; i < 8; i++) {
			figures[i] = new Pawn(board.getCoordinate(i,1), "Pawn");
		}
		figures[8] = new Rook(board.getCoordinate(0,0), "Rook");
		figures[9] = new Knight(board.getCoordinate(1,0), "Knight");
		figures[10] = new Bishop(board.getCoordinate(2,0), "Bishop");
		figures[11] = new Queen(board.getCoordinate(3,0), "Queen");
		figures[12] = new King(board.getCoordinate(4,0), "King");
		figures[13] = new Bishop(board.getCoordinate(5,0), "Bishop");
		figures[14] = new Knight(board.getCoordinate(6,0), "Knight");
		figures[15] = new Rook(board.getCoordinate(7,0), "Rook");
	}

	/**
	 * Method startGame Начало игры.
	 */
	public void startGame() {

		placementFigures();

		System.out.printf("\r\n%25s\r\n\r\n", "==START GAME==");
		System.out.println("Example: D2 D4");

	}
	/**
	 * Method game Игра.
	 */
	public void game() {
			//Проверка на корректность ввода
			String[] coordinates = input.validateUsersCoordinate(input.ask("Enter way: "));

			for(Figure figure : this.figures) {

				if(figure.getPosition().equals(coordinates[0]) &&
						input.doNotAcrossFigures(coordinates, board, this.figures) &&
						figure.way(coordinates[0], coordinates[1])) {
					System.out.println("Move is made.");
					System.out.println(figure.getName() + " [" + figure.getPosition() + "]");
					game();
				}
			}

			System.out.println("INCORRECT MOVE !");
			game();
	}


	public static void main(String[] args) {
		Play play = new Play();
		play.startGame();
		play.game();
	}
}