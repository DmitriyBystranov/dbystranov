package ru.job4j.chess;

import ru.job4j.chess.Figures.*;
import java.util.Arrays;

public class Play {

	private Board board = new Board();
	private Players player1 = new Players();
	private Players player2 = new Players();
	private Input input = new Input();

	Pawn pawn = new Pawn(board.getCoordinate(3, 1), "Pawn");


	public void startGame() {

		player1.setName(input.inputMove("Name Player 1: "));
		player2.setName(input.inputMove("Name Player 2: "));
		System.out.printf("\r\n%-10s\r\n\r\n", "==START GAME==");

	}

	public void game() {
		boolean mate = true;
		char[] move;
		while(mate) {

			pawn.setCoordinate(input.inputMove("Player 1: "));
			move = pawn.getCoordinate().toCharArray();

			if(move[1] == 56) {
				mate = false;
				System.out.println("End game.");
			}
		}
	}

	public static void main(String[] args) {
		Play play = new Play();
		play.startGame();
		play.game();
	}
}
