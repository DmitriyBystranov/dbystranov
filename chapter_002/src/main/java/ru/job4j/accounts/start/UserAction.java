package ru.job4j.accounts.start;

public interface UserAction {
    int key();
    void execute();
    String info();
}
