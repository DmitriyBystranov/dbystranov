package ru.job4j.array;
/**
	* Class ArrayDuplicate (Решение задачи 5.3).
	* @author Bystranov
	* @since 17.06.2017
	* @version 1.0
*/
import java.util.Arrays;

public class ArrayDuplicate {
/**
	* Method remove Исчет повторяющиеся ствроки и удаляет их не теряя последовательности.
	* @param mass - Проверяемый массив
	* @return mass - Возвращает отсортированный массив без дубликатов
*/	
	public static String[] remove(String[] mass) {
		int repetition = 0;
		String temp = null;
		for(int i = 0; i < mass.length; i++) {
			for(int j = mass.length - 1; j > i; j--) {
				if(mass[i].equals(mass[j])) {
					repetition++;
					for(int x = j; j < mass.length - 1; j++) {
						temp = mass[j];
						mass[j] = mass[j + 1];
						mass[j + 1] = temp;
					}
				}
			}
		}
		return mass = Arrays.copyOfRange(mass, 0, mass.length - repetition);
	}
}