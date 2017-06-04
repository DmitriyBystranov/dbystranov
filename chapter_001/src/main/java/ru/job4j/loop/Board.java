package ru.job4j.loop;

public class Board  {
	public String paint(int width, int heidht) {
		StringBuilder stringBilder = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		 for(int index = 0; index < width; index++) {
			
			
			for(int jindex = 0; jindex < heidht; jindex++) {
				if((jindex + index) % 2 == 0) {
					stringBilder.append("X");
					
				} else {
					stringBilder.append(" ");
					
				}
			}
			stringBilder.append(newLine);
		}
		return stringBilder.toString();
	}
}