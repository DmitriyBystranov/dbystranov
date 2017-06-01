package ru.job4j.calculator;
/**
	* Class Calculator решение задачи 2.3.
	* @author Bystranov
	* @since 28.05.2017
	* @version 1.0
*/
public class Calculator {
/**
	* Свойсво - результат.
*/
	private double result;
/**
	* Создает новый объект сложения с заданными значениями.
	* @param first - первое число
	* @param second - второе число
*/
	public void plus(double first, double second) {
		this.result = first + second;
	}
/**
	* Создает новый объект вычитания с заданными значениями.
	* @param first - первое число
	* @param second - второе число
*/
	public void minus(double first, double second) {
		this.result = first - second;
	}
/**
	* Создает новый объект умножения с заданными значениями.
	* @param first - первое число
	* @param second - второе число
*/
	public void multiply(double first, double second) {
		this.result = first * second;
	}
/**
	* Создает новый объект деления с заданными значениями.
	* @param first - первое число
	* @param second - второе число
*/
	public void sharing(double first, double second) {
		this.result = first / second;
	}
/**
	* Функция для получения значения поля "result".
	* @return Возвращает зчение после произведённых вычислений
*/
	public double getResult() {
		return this.result;
	}
}