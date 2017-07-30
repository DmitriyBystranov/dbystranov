package ru.job4j.accounts.start;

public class Menu {
	
 	private static String[] list = new String[7];
    private  int position;


	public void setList(String name) {
	    this.list[position] = name;
	    position++;
    }

	public static void startMenu() {
		System.out.printf("\r\n%1$32s%2$s%1$s\r\n\r\n", "===============", "MENU");
		
		for(int i = 0; i < list.length; i++) {
			System.out.printf("%26d%s%17s\r\n", i, ")", list[i]);
		}
	}
}