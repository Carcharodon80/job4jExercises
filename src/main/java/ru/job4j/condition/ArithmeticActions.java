package ru.job4j.condition;

/**
 * 7. Арифметические операции.
 * Необходимо реализовать метод, который принимает 3 параметра:
 * 1. Первый аргумент арифметического действия;
 * 2. Второй аргумент арифметического действия;
 * 3. Результат применения арифметического действия к двум первым аргументам.
 * метод должен быть реализован таким образом, чтобы он вернул строковое представление действия, которое выполнилось.
 * Например, первый аргумент 100, второй 200, а результат вычисления - 300 - значит метод должен вернуть строку "added".
 * Для разности - "subtracted", умножения - "multiplied", деления - "divided".
 * Если никакого арифметического действия над исходными значениями выполнить нельзя - метод должен вернуть строку "none".
 */
public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String answer = "none";
        if (left + right == rsl) {
            answer = "added";
        } else if (left - right == rsl) {
            answer = "subtracted";
        } else if (left * right == rsl) {
            answer = "multiplied";
        } else if (left / right == rsl) {
            answer = "divided";
        }
        return answer;
    }
}