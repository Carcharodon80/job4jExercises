package ru.job4j.array;

/**
 * 7. Максимум из первого и последнего элемента массива
 * Вам необходимо реализовать метод, который принимает массив целочисленных значений,
 * сравнивает между собой первый и последний элемент и возвращает максимальное из двух значений.
 */

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        return Math.max(array[0], array[array.length - 1]);
    }
}