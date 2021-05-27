package ru.job4j.array;

/**
 * 14. Доступ к элементам в двумерном массиве
 * Задание: класс печатает элементы массива, при этом он должен пропустить в каждом ряду первый и последний элемент.
 * Обратите внимание что массив не является квадратным. Вам необходимо раскомментировать код и правильно расставить условия во вложенном цикле.
 */
public class LoopForBoard {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}