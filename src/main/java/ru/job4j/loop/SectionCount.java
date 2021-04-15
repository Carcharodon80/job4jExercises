package ru.job4j.loop;

/**
 * 9.3. Найти количество отрезков, используя цикл
 * Даны два целых положительных числа length, section. length это расстояние.
 * Вам нужно не используя операцию деления найти сколько раз отрезок длиной section помещает в length.
 */
public class SectionCount {
    public static int count(int length, int section) {
        int rsl = 0;
        while (true) {
            if (length < section) {
                break;
            } else {
                rsl++;
                length -=section;
            }
        }
        return rsl;
    }
}