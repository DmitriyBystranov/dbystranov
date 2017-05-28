package ru.job4j.calculator;
/**
	* Class Calculator решение задачи 2.3.
	* @author Bystranov
	* @since 28.05.2017
	* @version "Alpha"
*/
public class Calculator {
/**
	* @param result - result.
*/
	private double result;
/**
	* Plus.
	* @param first.
	* @param second.
*/
	public void plus(double first, double second) {
		this.result = first + second;
	}
/**
	* Minus.
	* @param first.
	* @param second.
*/	
	public void minus(double first, double second) {
		this.result = first - second;
	}
/**
	* Multply.
	* @param first.
	* @param second.
*/	
	public void multiply(double first, double second) {
		this.result = first * second;
	}
/**
	* Sharing.
	* @param first.
	* @param second.
*/	
	public void sharing(double first, double second) {
		this.result = first / second;
	}
/**
	* plus.
*/	
	public double getResult() {
		return this.result;
	}
}