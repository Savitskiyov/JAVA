package Seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24
// Создайтет метод в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
// в данном массиве и вверните его в виде числа с плавающей запятой
// Для вычичления процента используйте формулу:
// Процент уникальных чисел = количество уникальных чисел * 100/ общее количество чисел в массиве
public class Seminar_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(getRandomNumber());
        }
        Set<Integer> set = new HashSet<>(arrayList);

        set.forEach((k) -> {System.out.printf("%s ", k); });

    }
    public static int getRandomNumber() {
        double x = (Math.random() * 24);
        int num = (int) x;
        return num;
    }
}
