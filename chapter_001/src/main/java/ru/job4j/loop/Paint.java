package ru.job4j.loop;
/**
	* Class Paint (Решение задачи 4.4).
	* @author Bystranov
	* @since 10.06.2017
	* @version 1.0
*/
public class Paint {
/**
	* Method piramida Строит пирамиду.
	* @param h - высота пирамиды
*/	
	public String piramida(int h) {
		StringBuilder piramida = new StringBuilder();
	String newLine = System.getProperty("line.separator");
		for(int i = 0; i < h; i++) {
			
			for(int j = -h+1; j < h; j++) {
				
				if(i >= Math.abs(j)) {
					piramida.append("^");
				} else {
					piramida.append(" ");
				}
				
			}
			piramida.append(newLine);
		}
		return piramida.toString();
	}
}