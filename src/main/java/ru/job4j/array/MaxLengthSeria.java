package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int rsl = 0;
        int tempRsl = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                tempRsl++;
            } else {
                rsl = tempRsl;
                tempRsl = 1;
            }
        }
        if (tempRsl > rsl) {
            rsl = tempRsl;
        }

        return rsl;

    }
}