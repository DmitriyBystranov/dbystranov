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
	* Метод, ведущий подсчёт стороны треугольника.
	* @param - первая точка
	* @param - вторая точка
*/	
	public double sideTriangle (Point side1, Point side2) {
		return Math.sqrt(Math.pow(side1.getX() - side2.getX(), 2) + Math.pow(side1.getY() - side2.getY(), 2));
	}
	
/**
	* Метод area.
	* В нём ведётся подсчёт площади треугольника по 3-м точкам.
	* @return Возвращает площадь треугольника
*/
	public double area() {
		double p = 0.5 * (sideTriangle(a, b) + sideTriangle(b, c) + sideTriangle(a, c));
		return Math.sqrt(p * (p - sideTriangle(a, b)) * (p - sideTriangle(b, c)) * (p - sideTriangle(a, c)));
	}
}