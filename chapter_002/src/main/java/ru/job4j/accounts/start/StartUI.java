package ru.job4j.accounts.start;

import ru.job4j.accounts.models.Item;
/**
 * Class StartUI (Точка входа программы "Tracker").
 * @author Bystranov
 * @since 30.07.2017
 * @version 1.0
 */
public class StartUI {

	private int[] range = {0, 1, 2, 3, 4, 5};
	private Input input;
	private Tracker tracker;

	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public void init() {

		Menu menu = new Menu(this.input, this.tracker);
		menu.fillActions();

		do {
			menu.show();
			menu.select(input.ask("\r\nSelect: ", range));
		} while (!"y".equals(this.input.ask("\r\nExit (y/n): ")));
	}

	public static void main(String[] args) {
		Input input = new ValidateInput();
		Tracker tracker = new Tracker();
		new StartUI(input, tracker).init();
	}
}