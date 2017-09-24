package ru.job4j.chess;

import ru.job4j.chess.figures.*;

public class Play {

	private Board board = new Board();
	private Players player1 = new Players();
	private Players player2 = new Players();
	private Input input = new Input();

	private Pawn pawn = new Pawn(board.getCoordinate(3, 1), "Pawn");


	public void startGame() {

		/*player1.setName(input.inputMove("Name Player 1: "));
		player2.setName(input.inputMove("Name Player 2: "));*/
		System.out.printf("\r\n%25s\r\n\r\n", "==START GAME==");

	}

	public void game() {
		boolean mate = true;
		int trueMove;
		char[] move;
		char[] moveOld = pawn.getPosition().toCharArray();
		String coordinate = null;
		while(mate) {
			trueMove = 0;
			pawn.setPosition(input.inputMove("Player 1: "));
			move = pawn.getPosition().toCharArray();

			for(int i = 65; i <= 72; i++) {
				for(int j = 1; j <= 8; j++) {
					coordinate = String.valueOf((char)i) + j;

					if(coordinate.equals(board.getCoordinate(i - 65,j - 1))) {
						System.out.println("Такая клетка существует.");
						break;
					} else if(i == 72 && j == 8) {
						System.out.println("Такой клетки не существует.");
						trueMove++;
						break;
					}
				}
			}

			if(trueMove == 1) {
				continue;
			}

			if(move[0] == moveOld[0] && move[1] > moveOld[1] && move[1] <= moveOld[1] + 2) {
				pawn.setPosition(coordinate);
				System.out.println("фигура сходила.");
				if(move[1] == 56) {
					mate = false;
					System.out.println("End game.");
				}
			} else {
				System.out.println("Так фигура не ходит.");
			}



			//System.out.println("Such cell do not exist. Please, moving again.");

		}
	}

	public static void main(String[] args) {
		Play play = new Play();
		play.startGame();
		play.game();
	}
}