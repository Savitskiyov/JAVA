package Seminar_4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.*;

public class DZ_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите минимальное число для рандома: ");
        int min = input.nextInt();
        System.out.println("введите максимальное число для рандома: ");
        int max = input.nextInt();
        System.out.println("Введите размер листа: ");
        int s = input.nextInt();
        input.close();

        LinkedList<Integer> arr = getRandomLinkedList(s, min, max);
        System.out.println(arr);
        reverseLinkedList(arr);
        System.out.println(arr);
    }

    static int getRandomNumberInt(int minimum, int maximum) { // рандомное число
        Random random = new Random();
        return random.nextInt(minimum, maximum);
    }

    static LinkedList<Integer> getRandomLinkedList(int size, int minimum, int maximum) { // создаем рандомный массив
        LinkedList<Integer> array = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static List<Integer> reverseLinkedList(LinkedList<Integer> array) { // через цикл
        List<Integer> temp = new LinkedList<Integer>(array);
        int j = 0;
        for (int i = temp.size()-1; i >= 0; i--) {
            array.set(j, temp.get(i));
            j++;
        }
        return array;
    }

    static List<Integer> reverseLinkedList2(LinkedList<Integer> array) { // через встроенный метод
        Collections.reverse(array);
        return array;
    }
}