package ru.job4j.array;

/**
 * 9. Размер двумерного массива
 * В задании вам необходимо реализовать 2 метода - первый возвращает размер массива, второй - количество элементов в ряду, номер которого мы передаем в метод.
 */
public class Board {
    public static int getCountRow(int[][] array) {
        return array.length;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        return array[row].length;
    }
}