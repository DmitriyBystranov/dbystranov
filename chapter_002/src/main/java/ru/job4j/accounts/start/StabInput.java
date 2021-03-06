package ru.job4j.accounts.start;

public class StabInput implements Input {

    private String[] answer;
    private int position = 0;

    public StabInput(String[] answer) {
        this.answer = answer;
    }

    @Override
    public String ask(String question) {
        return answer[position++];
    }

    @Override
    public int ask(String question, int[] range) {
        return Integer.valueOf(this.ask(question));
    }
}
