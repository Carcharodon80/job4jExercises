package ru.job4j.array;

/**
 * 13. Доступ к остальным элементам массива
 * Задание: метод main должен распечатать все элементы массива за исключением первого элемента и последнего.
 * Вам необходимо расскоментировать код и правильно расставить условия цикла for().
 */
public class LoopForArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}