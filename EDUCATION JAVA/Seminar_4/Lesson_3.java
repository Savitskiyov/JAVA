package Seminar_4;
//Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стека.
// Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Lesson_3 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = getRandomNumber();
        }

        Queue<Integer> stack = new LinkedList<>();
        for (int i = 0; i <arr.length ; i++) {
            stack.add(arr[i]);

            }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(stack.peek());
        }


    }
    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
