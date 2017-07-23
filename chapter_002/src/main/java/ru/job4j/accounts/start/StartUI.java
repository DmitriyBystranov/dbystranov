package ru.job4j.accounts.start;

public class StartUI {
	public static void main(String[] args) {

		Menu menu = new Menu();
		ConsoleInput input = new ConsoleInput();
		Tracker tracker = new Tracker();

		menu.setList("Add new Item");
		menu.setList("Show all items");
		menu.setList("Edit item");
		menu.setList("Delete item");
		menu.setList("Find item by Id");
		menu.setList("Find items by name");
		menu.setList("Exit Program");

		Menu.startMenu();

		input.numberFunction();

		switch(input.numberFunction()) {

		}
	}
}