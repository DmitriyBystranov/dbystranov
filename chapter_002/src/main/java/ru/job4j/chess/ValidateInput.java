package ru.job4j.chess;

import ru.job4j.chess.figures.Figure;

public class ValidateInput extends ConsoleInput {
    /**
     * Method validateUsersCoordinate Обработка исключения (вылетает при одной из вариаций некорректного ввода).
     * @param question - То что ввёл пользователь.
     * @return true - Возвращает массив из 2-х введённых координат.
     */
    public String[] validateUsersCoordinate(String question) {

        boolean invalid = true;
        String[] coordination = null;
        do {
            try {
                coordination = super.correctlyCoordinate(question);
                invalid = false;
            } catch (ArrayIndexOutOfBoundsException a) {
                question = super.ask("Is NOT true! Pleas go again: ");
            }
        } while(invalid);

        return coordination;
    }
    /**
     * Method emptyOrRich (пусто или густо) Проверяет на наличие фигуры на данной клетке.
     * @param position - Ячейка массива.
     * @param figures - Массив с фигурами.
     * @return true - Возвращает массив из 2-х введённых координат.
     */
    public boolean emptyOrRich(String position, Figure[] figures) {
        for(Figure  figure : figures) {
            if(figure.getPosition().equals(position)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Method doNotAcrossFigures Проверяет на вероятность хода сквозь другие фигуры.
     * @param coordinate - Массив из 2-х координат, введённый пользователем.
     * @param board - Доска для вызова координат клеток на ней.
     * @param figures - Массив с фигурами.
     * @return true - Возвращает массив из 2-х введённых координат.
     */

    public boolean doNotAcrossFigures(String[] coordinate, Board board, Figure[] figures) {

        int position1i = 0;
        int position2i = 0;
        int position1j = 0;
        int position2j = 0;

// Скорировал метод хода коня, чтобы этот метод не распространялся на него.
        if(Math.abs(coordinate[0].charAt(0) - coordinate[1].charAt(0)) == 2 &&
                Math.abs(coordinate[0].charAt(1) - coordinate[1].charAt(1)) == 1 ||
                    Math.abs(coordinate[0].charAt(0) - coordinate[1].charAt(0)) == 1 &&
                        Math.abs(coordinate[0].charAt(1) - coordinate[1].charAt(1)) == 2) {
            return true;
        }

        /*
        Следующие условия нужны чтобы при любом ходе, проверка клеток по циклу шла от меньшего числа к большему,
        от меньшей буквы к большей.
         */

        //if i > i(old)
        if(coordinate[0].charAt(0) > coordinate[1].charAt(0)) {
            position1i = coordinate[1].charAt(0);
            position2i = coordinate[0].charAt(0);
        } else {
            position1i = coordinate[0].charAt(0);
            position2i = coordinate[1].charAt(0);
        }
        //if j > j(old)
        //Таким извращённым методом перевожу символ в число. Подругом как это сделать не знаю.
        if(Integer.parseInt(String.valueOf(coordinate[0].charAt(1))) > Integer.parseInt(String.valueOf(coordinate[1].charAt(1))))  {
            position1j = Integer.parseInt(String.valueOf(coordinate[1].charAt(1)));
            position2j = Integer.parseInt(String.valueOf(coordinate[0].charAt(1)));
        } else {
            position1j = Integer.parseInt(String.valueOf(coordinate[0].charAt(1)));
            position2j = Integer.parseInt(String.valueOf(coordinate[1].charAt(1)));
        }

        /*
        Если при ходе одна из координат не изменяется, этот цикл отстанется стоячим.
        Если да, то прибовляется на клетку вперёд, чтобы проверка клеток, не начиналась
        от клетки на которой стояла фигура.
         */

        if(position1j != position2j) {
            position1j++;
        }

        if(position1i != position2i) {
            position1i++;
        }


        for(int i = position1i - 'A'; i <= position2i - 'A'; i++) {
            for(int j = position1j - 1; j <= position2j - 1; j++) {
                if(!emptyOrRich(board.getCoordinate(i,j), figures)) {
                    return false;
                }

            }
        }
        return true;
    }

}