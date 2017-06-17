package ru.job4j.array;
/**
	* Class RotateArray (Решение задачи 5.2).
	* @author Bystranov
	* @since 17.06.2017
	* @version 1.0
*/
public class RotateArray {
/**
	* Method rotate поворачивает двумерный массив (матрицу) на 90 градусов по часовой стрелке.
	* @param arrayOrigin - Действующий массив
	* @param arrayCopy - Вспомогательный массив
	* @return mass - Возвращает повёрнутый массив
*/	
	public static int[][] rotate(int[][] arrayOrigin, int[][] arrayCopy) {
		
		for(int i = 0; i < arrayOrigin.length; i++) {
			for(int j = 0; j < arrayCopy.length; j++) {
			
				arrayCopy[j][arrayCopy.length - i - 1] = arrayOrigin[i][j];
			}
		}
		
		return arrayOrigin = arrayCopy;
	}
}

