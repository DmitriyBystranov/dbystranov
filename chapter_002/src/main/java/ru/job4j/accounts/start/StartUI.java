package ru.job4j.accounts.start;

import ru.job4j.accounts.models.Item;
/**
 * Class StartUI (Точка входа программы "Tracker").
 * @author Bystranov
 * @since 30.07.2017
 * @version 1.0
 */
public class StartUI {

	private Input input;
	private Tracker tracker;

	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public void init() {

		Tracker tracker = new Tracker();
		Menu menu = new Menu(this.input, tracker);
		menu.fillActions();

		do {
			menu.show();
			int key = Integer.valueOf(input.ask("\r\nSelect: "));
			menu.select(key);
		} while (!"y".equals(this.input.ask("\r\nExit (y/n): ")));
	}

	public static void main(String[] args) {
		Input input = new ConsoleInput();
		Tracker tracker = new Tracker();
		new StartUI(input, tracker).init();
	}
}