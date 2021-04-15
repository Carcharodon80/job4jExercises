package ru.job4j.loop;

/**
 * 6. Произведение чисел в диапазоне
 * Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
 */
public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int rsl = a;
        for (int i = a + 1; i <= b; i++) {
            rsl *= i;
        }
        return rsl;
    }
}