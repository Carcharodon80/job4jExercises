package ru.job4j.array;
/**
 * 21. indexOf с числом вхождений
 * Ваша задача написать метод, который возвращает индекс по количество вхождений. Если ничего не найдено нужно вернуть -1
 * Если если число вхождений указано равное 1, то метод работает как обычный indexOf()
 * <p>
 * Пример
 * Для строки "abc", с номером вхождения 1, при поиске символа 'c', должно вернуться 2
 * Для строки "abcdec", с номером вхождения 2, при поиске символа 'c', должно вернуться 5
 * Для строки "abc", с номером вхождения 1, при поиске символа 'z', должно вернуться -1
 */
public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int tempIndex = 0;
        int countEvents = 0;    //число совпадений
        String word = new String(string);
        while (true) {
            if (word.indexOf(c, tempIndex) == -1) break;
            else {
                countEvents++;
                if (countEvents == number) {
                    rsl = word.indexOf(c, tempIndex);
                    break;
                } else {
                    rsl = word.indexOf(c, tempIndex);
                    tempIndex = rsl + 1;
                }
            }
        }
        return rsl;
    }
}