package ru.job4j.array;

/**
 * 18. Суммирования предыдущих значений
 * Даны целые числа n (> 2), a и b. Сформировать и вывести целочисленный массив размера n,
 * первый элемент которого равен a, второй равен b, а каждый последующий элемент равен сумме всех предыдущих.
 */
public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = 0;
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += array[j];
            }
            array[i] = sum;
            sum = 0;
        }
        return array;
    }
}