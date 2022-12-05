package Seminar_3;
//Заполнить список десятью случайными числами
// Отсортировать список методом sort()  и вывести его на экран
import java.util.ArrayList;
import java.util.List;

public class Lesson_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 11 ; i++) {
            list.add(getRandomNumber());
        }
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
