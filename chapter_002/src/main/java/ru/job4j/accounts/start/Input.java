package ru.job4j.accounts.start;

public interface Input {
	String ask(String question);
	int ask(String question, int[] range);
}
