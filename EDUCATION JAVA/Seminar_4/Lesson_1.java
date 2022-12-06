package Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

// Замерьте время, за которое в ArrayList добавятся 10000 элементов
// Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим
public class Lesson_1 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        System.out.println(System.currentTimeMillis() - s);


        s = System.currentTimeMillis();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            ll.add(i);
        }
        System.out.println(System.currentTimeMillis() - s);

        System.out.println("------------------------------");


        String str = "123";
        var l = System.currentTimeMillis();
        ArrayList<String> all = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            all.add(str);
        }
        System.out.println(System.currentTimeMillis() - l);

        l = System.currentTimeMillis();
        LinkedList<String> lll = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            lll.add(str);
        }
        System.out.println(System.currentTimeMillis() - s);

    }
}
