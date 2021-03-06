package ru.job4j.loop;

/**
 * 10. Расстояние Хэмминга
 * Расстояние Хэмминга - это число позиций в которых соответствующие символы двух слов одинаковой длины различны.
 * Например, сравнивая "101010111" и "111010100" мы должны получить - 3, поскольку не равны 3 символа
 * Метод принимает 2 строки, всегда одинаковой длины. Необходимо определить для строки расстояние Хэмминга.
 */
public class Hamming {
    public static int checkStrings(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                rsl++;
            }
        }
        return rsl;
    }
}