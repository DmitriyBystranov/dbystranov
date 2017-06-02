package ru.job4j.loop;
/**
	* Class Counter (Решение задачи 4.1).
	* @author Bystranov
	* @since 02.06.2017
	* @version 1.0
*/
public class Counter {
/**
	* Method add Возвращает сумму чётных чисел.
	* @param start - начальное число
	* @param finish - конечное число
*/
	public int add(int start, int finish) {
		
		int result = 0;
		
		for(int index = start; index <= finish; index++) {
			
			if(index % 2 == 0) {
				result += index;
			}
		}
		return result;
	}
}