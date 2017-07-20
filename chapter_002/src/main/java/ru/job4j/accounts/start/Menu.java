package ru.job4j.accounts.start;

public static class Menu {
	
 	private String[] list = new String[7];
	private int position;
	list[0] = "Add new Item";
	list[1] = "Show all items";
	list[2] = "Edit item";
	list[3] = "Delete item";
	list[4] = "Find item by Id";
	list[5] = "Find items by name";
	list[6] = "Exit Program";
	
	public String[] getList(String list[position]) {
		return list[position] = this.list[position]; 
	}
	
	public void startMenu() {
		
		System.out.printf("\r\n%1$32s%2$s%1$s\r\n\r\n", "===============", "MENU");
		
		for(i = 0; i < list.length; i++) {
			System.out.printf("%26d%17s/r/n", i, Menu.getList(list[i]));
		}
	}
}