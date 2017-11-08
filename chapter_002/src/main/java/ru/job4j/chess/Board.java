package ru.job4j.chess;
// 65 - 72
public class Board {
	
	private String[][] cell = new String[8][8];

	public Board() {
		filling();
	}

	public String getCoordinate(int i, int j) {
		return this.cell[i][j];
	}

	/**
	 * Method filling Присваивает каждой клетке свою координату.
	 */

	public void filling() {

		for(int i = 'A'; i <= 'H'; i++) {
			for(int j = 1; j <= cell.length; j++) {
				cell[i - 65][j - 1] = String.valueOf((char)i) + j;
			}
		}
	}
}