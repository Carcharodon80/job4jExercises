package ru.job4j.loop;

/**
 * 13. Аббревиатуры
 * Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
 * Необходимо из полученной строки сформировать аббревиатуру.
 * Для формирования новой строки используйте StringBuilder и его метод append().
 */
public class Abbreviation {
    public static String collect(String s) {
        String[] array = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i].charAt(0));
        }
        s = stringBuilder.toString();
        return s;
    }
}