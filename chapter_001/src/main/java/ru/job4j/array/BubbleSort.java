package ru.job4j.array;
/**
	* Class BubbleSort (Решение задачи 5.1).
	* @author Bystranov
	* @since 17.06.2017
	* @version 1.0
*/
public class BubbleSort {
/**
	* Method sort Производит сортировку пузырьком.
	* @param - Проверяемый массив
	* @return - Возвращает отсортированный массив
*/
	public static void sort(int[] mass) {
		
		int temp;
		
		for(int i = 0; i < mass.length; i++) {
			
			for(int j = 0; j < mass.length - 1 - i; j++) {
				
				if(mass[j] > mass[j + 1]) {
					
					temp = mass[j];
					mass[j] = mass[j + 1];
					mass[j + 1] = temp;
				}
			}
		}
	}
}

