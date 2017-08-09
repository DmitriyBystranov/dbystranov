package ru.job4j.accounts.start;

import ru.job4j.accounts.models.Item;
/**
 * Class StartUI (Точка входа программы "Tracker").
 * @author Bystranov
 * @since 30.07.2017
 * @version 1.0
 */
public class StartUI {

	private static boolean exit = true;
	private final Menu menu = new Menu();
	private final Input input;
	private final Tracker tracker;

	private static final int ADD = 0;
	private static final int ALL = 1;
	private static final int EDIT = 2;
	private static final int DELETE = 3;
	private static final int ID = 4;
	private static final int NAME = 5;
	private static final int EXIT = 6;

	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	/**
	 * Method addUI реализует метод add в пользовательском интерфейсе.
	 */
	public void addUI() {
		Item item = tracker.add(new Item());
		item.setName(input.ask("Pleas, enter the item's NAME: "));
		item.setDescription(input.ask("Pleas, enter the item's DESCRIPTION: "));
	}
	/**
	 * Method getAllUI реализует метод getAll в пользовательском интерфейсе.
	 */
	public void getAllUI() {
		tracker.getAll();
		for (Item item3 : tracker.getAll()) {
			System.out.print(item3.toString());
		}
	}
	/**
	 * Method editUI реализует метод edit в пользовательском интерфейсе.
	 */
	public void editUI() {
		Item item = tracker.findById(input.ask("Enter ID: "));
		item.setName(input.ask("Pleas, enter the item's NAME: "));
		item.setDescription(input.ask("Pleas, enter the item's DESCRIPTION: "));
		tracker.edit(item);
	}
	/**
	 * Method deleteUI реализует метод delete в пользовательском интерфейсе.
	 */
	public void deleteUI() {
		System.out.println("Item " + tracker.delete(input.ask("Pleas, enter the item's ID you want to be delete: ")) + " is delete.");
	}
	/**
	 * Method findByNameUI реализует метод findByName в пользовательском интерфейсе.
	 */
	public void findByNameUI() {
		System.out.println(tracker.findByName(input.ask("Pleas, enter the item's NAME: ")));
	}
	/**
	 * Method findByIdUI реализует метод findById в пользовательском интерфейсе.
	 */
	public void findByIdUI() {
		System.out.println(tracker.findById(input.ask("Pleas, enter the item's ID: ")));
	}

	public void init() {
		menu.setList("Add new Item");
		menu.setList("Show all items");
		menu.setList("Edit item");
		menu.setList("Delete item");
		menu.setList("Find item by Id");
		menu.setList("Find items by name");
		menu.setList("Exit Program");

		Menu.startMenu();

		while (exit) {

			switch(input.numberFunction()) {
				case ADD :
					this.addUI();
					break;
				case ALL:
					this.getAllUI();
					break;
				case EDIT:
					this.editUI();
					break;
				case DELETE:
					this.deleteUI();
					break;
				case ID:
					this.findByIdUI();
					break;
				case NAME:
					this.findByNameUI();
					break;
				case EXIT:
					exit = false;
					break;
			}
		}
	}

	public static void main(String[] args) {
		new StartUI(new ConsoleInput(), new Tracker()).init();
	}
}