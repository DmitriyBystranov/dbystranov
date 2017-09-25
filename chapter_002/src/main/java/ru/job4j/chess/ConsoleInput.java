package ru.job4j.chess;

import java.util.Scanner;

public class ConsoleInput {
    ConsoleInput consInput = new ConsoleInput();
    Scanner input = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return input.nextLine();
    }

    public String move(String wayFigure) {
        String[] splitWayFigure = wayFigure.split(" ", 2);


    }
}
