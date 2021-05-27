package ru.job4j.array;

/**
 * 12. Проверить является ли двумерный массив квадратным.
 * В этом задании Вам необходимо будет проверить является ли входящий двумерный массив квадратным
 * (т.е. количество элементов в каждом ряду, должно совпадать с количеством рядов). Вам необходимо:
 * 1. Расскомментировать код.
 * 2. Правильно организовать цикл for.
 * 3. Правильно организовать проверку if.
 */
public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int i = 0; i < array.length ; i++) {
            if (array[i].length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}