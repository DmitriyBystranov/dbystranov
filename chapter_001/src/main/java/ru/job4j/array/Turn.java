package ru.job4j.array;

public class Turn {
	public void back(int[] mass) {
		int temp;
		String newLine = System.getProperty("line.separator");
		
		for(int i = 0; i < mass.length; i++) {
			if(i >= (mass.length - 1) / 2){
				break;
			}
			temp = mass[i];
			mass[i] = mass[mass.length - 1 - i];
			mass[mass.length - 1 - i] = temp;
		}
	}
}
