package ru.job4j.chess;

import java.util.Scanner;

public class ConsoleInput {

    private Board board = new Board();

    private Scanner input = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return input.nextLine();
    }
    /**
     * Method correctlyCoordinate Проверяет корректность ввода пользователя.
     * @param coordinate - ввод пользователя.
     * @return splitWayFigure - Массив из 2-х координат, старой и новой.
     */
    public String[] correctlyCoordinate(String coordinate) throws ArrayIndexOutOfBoundsException {

        int counter = 0;

        //Делим введённую строку на 2 координаты.
        String[] splitWayFigure = coordinate.split(" ", 2);


        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {

                // Если первая координата существует на доске и не введено 2-х одинаковых координат...
                if(splitWayFigure[0].equals(board.getCoordinate(i,j)) && !splitWayFigure[0].equals(splitWayFigure[1])) {
                    counter++;
                }
                // Если вторая координата существует на достке...
                if(splitWayFigure[1].equals(board.getCoordinate(i,j))) {
                    counter++;
                }
            }
        }
        // Рекурсия
        if(counter != 2) {
            correctlyCoordinate(ask("Is NOT true! Pleas go again: "));
        }
        return splitWayFigure;
    }
}