package ru.job4j.array;

/**
 * 8. Индекс максимального значения
 * В этом задании Вам необходимо расскомментировать код, добавить обращение к элементам массива по индексу и исправить небольшую ошибку.
 * Метод должен вернуть индекс элемента который является максимальным из двух: первый элемент и последний элемент.
 */
public class IndexMaxElement {
    public static int getIndexMax(int[] array) {
        int rsl = array[0] > array[array.length - 1] ? 0 : array.length - 1;
        return rsl;
    }
}