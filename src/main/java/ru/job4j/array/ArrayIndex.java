package ru.job4j.array;

/**
 * 5. Индексы в массивах
 * В задании необходимо расскомментировать, расставить значения индексов так,
 * чтобы первый метод возвращал первый элемент массива, а второй метод - последний элемент массива.
 */
public class ArrayIndex {

    public static int getFirstElement(int[] array) {
        int rsl = array[0];
        return rsl;
    }

    public static int getLastElement(int[] array) {
        int rsl = array[array.length - 1];
        return rsl;
    }
}