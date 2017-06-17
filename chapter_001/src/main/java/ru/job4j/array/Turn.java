package ru.job4j.array;
/**
	* Class Turn (Решение задачи 5.0).
	* @author Bystranov
	* @since 17.06.2017
	* @version 1.0
*/
public class Turn {
/**
	* Method back меняет значения элементов массива задом на перёд.
	* @param mass - Проверяемый массив
*/	
	public void back(int[] mass) {
		int temp;
		String newLine = System.getProperty("line.separator");
		
		for(int i = 0; i < mass.length / 2; i++) {
			
			temp = mass[i];
			mass[i] = mass[mass.length - 1 - i];
			mass[mass.length - 1 - i] = temp;
		}
	}
}
