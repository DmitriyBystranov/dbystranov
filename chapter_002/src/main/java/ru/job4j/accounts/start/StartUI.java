package ru.job4j.accounts.start;

import ru.job4j.accounts.models.Item;

public class StartUI {
	public static void main(String[] args) {
		boolean exit = true;
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


		while (exit == true) {

			switch(input.numberFunction()) {
				case 0 : tracker.add(new Item());
					break;
				case 1 : tracker.getAll();
					break;
				//case 3 : tracker.delete();
				case 6 : exit = false;
					break;
			}
		}

		/*switch(input.numberFunction()) {
		^	case 0 : tracker.add(new Item());
			break;
			case 1 : tracker.getAll();
			break;
			case 2 : tracker.update();
			break;
			case 3 : tracker.delete();
			break;
			case 4 : tracker.findById();
			break;
			case 5 : tracker.findByName();
			break;
			case 6 :
		}*/
	}
}