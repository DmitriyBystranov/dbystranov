package ru.job4j.condition;
/**
	* Class Triengl (Решение задачи 3.3).
	* @author Bystranov
	* @since 30.05.2017
	* @version 1.0
*/
public class Triangle {
/** * Поля - 3 точки, по которым стороится треугольник. */
	private Point a;
	private Point b;
	private Point c;
/**
	* Конструктор, приравнивающий каждый параметр к полю.
	* @param a - точка треугольника
	* @param b - точка треугольника
	* @param c - точка треугольника
*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
/**
	* Метод area.
	* В нём ведётся подсчёт площади треугольника по 3-м точкам.
	* @return Возвращает площадь треугольника
*/
	public double area() {
		double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
		double bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
		double ac = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
		double p = 0.5 * (ab + bc + ac);
		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
	}
}