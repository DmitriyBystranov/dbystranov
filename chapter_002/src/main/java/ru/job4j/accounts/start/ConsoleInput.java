package ru.job4j.accounts.start;
import java.util.Scanner;
public class ConsoleInput implements Input {

	private Scanner scanner = new Scanner(System.in);

	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
	/*
	Для Handel Exception после метода нужно перечисли, какие ошибки он может вывести.
	Для Run-time Exception такого делать не нужно.
	 */
	@Override
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for(int value : range) {
			if(value == key) {
				exist = true;
				break;
			}
		}
		if(exist) {
			return key;
		} else {
			throw new MenuOutException("Out of menu range.");
		}
	}
}
