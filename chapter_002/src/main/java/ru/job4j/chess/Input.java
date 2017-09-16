package ru.job4j.chess;

import java.util.Scanner;

public class Input {

    private Scanner input = new Scanner(System.in);

    public String inputMove(String question) {
        System.out.print(question);
        return input.nextLine();
    }
}
