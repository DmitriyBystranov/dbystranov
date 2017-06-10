package ru.job4j.max;
/**
	* Class Max (Решение задачи 3.1).
	* @author Bystranov
	* @since 30.05.2017
	* @version 1.0
*/
public class Max {
/**
	* Метод возвращает максимальное значение из двух
	данных ему чисел.
	* @param first - первое число
	* @param second - второе число
	* @return Возвращает значение после проверки условия
*/
	public int max1(int first, int second) {

		int value = first > second ? first : second;
		return value;
	}
	
	public int max2(int first, int second, int thirt) {
		return max1(max1(first, second),thirt);
	}
}