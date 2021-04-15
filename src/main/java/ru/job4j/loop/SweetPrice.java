package ru.job4j.loop;

/**
 * 5. Вывести стоимость конфет за килограмм
 *  Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 5 кг конфет.
 */
public class SweetPrice {
    public static void out(int price) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * price);
        }
    }
}
