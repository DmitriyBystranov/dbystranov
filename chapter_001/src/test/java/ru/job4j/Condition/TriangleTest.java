package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
	* Class TrienglTest (Решение задачи 3.3).
	* @author Bystranov
	* @since 30.05.2017
	* @version 1.0
*/
public class TriangleTest {
/**
	* Метод.
	* @param a - точка треугольника
	* @return
*/
	@Test
	public void triangleTest() {
	 Point a = new Point(0,0);
	 Point b = new Point(0,2);
	 Point c = new Point(2,0);
		Triangle treangl = new Triangle(a,b,c);
			double result = treangl.area();
			double expected = 2D;
		assertThat(result, closeTo(expected, 0.01));
	}
}