package ru.job4j.chess;
// 65 - 72
public class Board {
	
	private String[][] cell = new String[8][8];
	
	public String filling() {

		for(int i = 65; i <= 72; i++) {
			for(int j = 1; j <= cell.length; j++) {
				cell[i - 65][j - 1] = String.valueOf((char)i) + j;
			}
		}

		return cell[3][2];
	}
}
