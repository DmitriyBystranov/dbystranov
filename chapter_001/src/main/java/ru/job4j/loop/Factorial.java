package ru.job4j.loop;
/**
	* Class Counter (Решение задачи 4.1).
	* @author Bystranov
	* @since 02.06.2017
	* @version 1.0
*/
public class Factorial {
/**
	* Method calc Считает факториал числа.
	* @param n - факториал какого числа нужно брать
*/
	public int  calc(int n) {
		
		int result = 1;
		
		for(int index = 1; index <= n; index++) {
			result *= index;
		}
		return result;
	}
}