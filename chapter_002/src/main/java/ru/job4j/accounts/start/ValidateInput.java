package ru.job4j.accounts.start;

public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
                // Сначала обрабатываем более исключительные ситуации, потом менее исключительные.
                /*
                Если используем handel Exception, нам необходимо их обрабатывать.
                Если Run-time Exception, обрабатывать не нужно.
                 */
            } catch (NumberFormatException n) {
                System.out.print("Please, enter validate data again: ");
            } catch (MenuOutException m) {
                System.out.println("Please, select key from menu");
            }
        } while (invalid);

        return value;
    }
}
