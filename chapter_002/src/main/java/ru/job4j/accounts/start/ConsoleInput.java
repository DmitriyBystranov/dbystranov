package ru.job4j.accounts.start;
import java.util.Scanner;
public class ConsoleInput implements InputInterface {

	private Scanner scanner = new Scanner(System.in);

	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

	public int numberFunction() {
		System.out.printf("\r\n%1$26s", "Select: ");
		return scanner.nextInt();
	}
}
