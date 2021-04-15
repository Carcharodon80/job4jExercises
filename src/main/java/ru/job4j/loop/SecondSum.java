package ru.job4j.loop;

/**
 * 9.2. Найти сумму каждого второго числа в диапазоне
 * Даны два целых положительных числа a и b (b > a). Надо сложить каждое второе число в диапазоне [a, b] начиная с первого
 */
public class SecondSum {
    public static int sum(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i = i + 2) {
            rsl += i;
        }
        return rsl;
    }
}