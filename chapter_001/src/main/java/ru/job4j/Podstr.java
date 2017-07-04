package ru.job4j;
/**
	* Class Podstr (Решение тестового задания модуля 1).
	* @author Bystranov
	* @since 01.07.2017
	* @version 2.0
*/
public class Podstr {
/**
	* Method contains провериет, является ли данная подстрока частью строки.
	* @param originString - Строка
	* @param testString - Подстрока
	* @return verify - Возвращает истину, если является и лож, если нет
*/	
	public static boolean contains(String originString, String testString) {
		
		boolean verify = true; // Выносит вердикт, совпадения строки с подстрокой.

		String[] massCharacterOfOriginString = originString.split(""); // Метод split разбивает строку на массив строк, в каждой ячейке которого одна буква слова.
		String[] massCharacterOfTestString = testString.split("");
		for(int i = 0; i < massCharacterOfOriginString.length - massCharacterOfTestString.length + 1; i++) { // Ограничение идёт: Длинна строки - длинна подстроки + 1 т.к. бессмысленно сравниварть, если в строке остаётся меньше символов чем имеет подстрока.
			if(!massCharacterOfOriginString[i].equals(massCharacterOfTestString[0])) { // если первые символы не сопадают, то нет смысла делать проверку дальше.
				continue;
			}
			for(int j = 0; j < massCharacterOfTestString.length; j++) {
				if(!massCharacterOfOriginString[j + i].equals(massCharacterOfTestString[j])) {
					break;
					
				} else if(j == massCharacterOfTestString.length - 1) { // если j дошло до последнего элемента массва подстроки, то программа завершает работу.
						System.out.println("this strin " + testString + " is substring. It's TRUE!");
						return verify; // завершение работы программы.
					}
			}
		}
		return verify = false; // если подстрока пробежалась по всем символов строки и совпадения нет.
		
	}
}

/**
	Прошлый код.
*/

/*
public class Podstr {
	public static boolean contains(String originString, String testString) {
		boolean verify = true;
		int counter = 0;
		int counterJ = 0;
		String[] massCharacterOfOriginString = originString.split("");
		String[] massCharacterOfTestString = testString.split("");
		for(int i = 0; i < massCharacterOfOriginString.length; i++) {
			for(int j = counterJ; j < massCharacterOfTestString.length; j++) {
				if(massCharacterOfOriginString[i].equals(massCharacterOfTestString[j])) {
					counter++;
					counterJ++;
					if(counter == massCharacterOfTestString.length) {
						verify = true;
					}
					break;
					
				} else {
					counter = 0;
					counterJ = 0;
					break;
				}
			}
		}
		
		if(counter != massCharacterOfTestString.length) {
			verify = false;
		}
		return verify;
	}
}
*/