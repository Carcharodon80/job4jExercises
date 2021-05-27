package ru.job4j.array;

/**
 * 16. Заполнить треугольную матрицу
 * Треугольная матрица, это матрица вида:
 * 1
 * 2 3
 * 4 5 6
 * Вам дано количество строк в результирующей матрице. Вам нужно заполнить ее.
 */
public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int index = 1;
        int number = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[index];
            for (int j = 0; j < index; j++) {
                triangle[i][j] = number;
                number++;
            }
            index++;
        }
        return triangle;
    }
}
