package ru.job4j.chess;
// 65 - 72
public class Board {
	
	private String[][] cell = new String[8][8];
	
	public String filling() {

		String str = new String();
		char symbol = 0;

		for(int i = 65; i <= 72; i++) {
			for(int j = 1; j <= cell.length; j++) {
				symbol = (char)i;
				str = String.valueOf(symbol) + j;
				cell[i][j] = str;
			}
		}

		return cell[4][3];
	}
}
