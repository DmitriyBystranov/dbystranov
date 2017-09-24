package ru.job4j.accounts.start;

public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException n) {
                System.out.print("Please, enter validate data again: ");
            } catch (MenuOutException m) {
                System.out.println("Please, select key from menu");
            }
        } while (invalid);

        return value;
    }
}
