package ru.job4j.array;

/**
 * 20. Вывести четные в порядке убывания индексов
 * Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве четные числа в порядке убывания их индексов.
 * Для вывода использовать System.out.println()
 */
public class EvenPrint {
    public static void print(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
