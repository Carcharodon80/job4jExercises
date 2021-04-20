package ru.job4j.array;

/**
 * 3. Объединить два отсортированных массива
 *  Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
 */
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexRsl = 0;
            for (int j = 0; j < left.length; j++) {
                rsl[indexRsl] = left[j];
                indexRsl++;
            }
            for (int j = 0; j < right.length; j++) {
                rsl[indexRsl] = right[j];
                indexRsl++;
            }
        return rsl;
    }
}
