package ru.job4j.accounts.start;

public abstract class BaseAction implements UserAction {

    private String name;
    private int key;

    public BaseAction(String name, int key) {
        this.name = name;
        this.key = key;
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, name);
    }
}
