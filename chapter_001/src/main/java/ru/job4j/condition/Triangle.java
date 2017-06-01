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
/** * Точка 2. */
	private Point b;
/** * Точка 3. */
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
		ab = Math.sqrt(Math.sqr((a.getX() - b.getX())) + Math.sqr((a.getY() - b.getY())));
		bc = Math.sqrt(Math.sqr((b.getX() - c.getX())) + Math.sqr((b.getY() - c.getY())));
		ac = Math.sqrt(Math.sqr((a.getX() - c.getX())) + Math.sqr((a.getY() - c.getY())));
		p = 0.5 * (ab + bc + ac);
		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
	}
}