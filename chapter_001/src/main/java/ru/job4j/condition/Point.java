package ru.job4j.condition;
/**
	* Class Point (Решение задачи 3.2).
	* @author Bystranov
	* @since 30.05.2017
	* @version 1.0
*/
public class Point {

/**
	* Поля - два числа.
*/

	private int x, y;

/**
	* Метод определяющий находится ли точка на этой
	фукнции.
	* @param k - первый параметр
	* @param j - второй параметр
	* @return Возвращает истину или лож в зависимочти,
	от того, находится ли точка на фукнции или нет
*/

	public boolean is(int k, int j) {
		return this.y == k * this.x + j;
	}

/**
	* Метод приравнивающий поле х с параметром х и поле у с параметром у.
	* @param x - точка на координате х
	* @param y - точка на координате у
*/

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

/**
	* Метод getX.
	* @return Возвращает значение поля х
*/

	public int getX() {
		return this.x;
	}

/**
	* Метод getY.
	* @return Возвращает значение поля y
*/

	public int getY() {
		return this.y;
	}
}