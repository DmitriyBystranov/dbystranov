package ru.job4j.accounts.start;

public class StartUI {
	public static void main(String[] args) {
		System.out.printf("\r\n%1$32s%2$s%1$s\r\n\r\n", "===============", "MENU");
		System.out.printf("%26s%17s\r\n", "0.", "Add new Item");
		System.out.printf("%26s%17s\r\n", "1.", "Show all items");
		System.out.printf("%26s%17s\r\n", "2.", "Edit item");
		System.out.printf("%26s%17s\r\n", "3.", "Delete item");
		System.out.printf("%26s%17s\r\n", "4.", "Find item by Id");
		System.out.printf("%26s%17s\r\n", "5.", "Find items by name");
		System.out.printf("%26s%17s\r\n\r\n", "6.", "Exit Program");
		System.out.printf("%1$26s\r\n", "Select: ");
		
		System.out.println("/r/n/r/n");
		
		Menu.startMenu();
	}
}