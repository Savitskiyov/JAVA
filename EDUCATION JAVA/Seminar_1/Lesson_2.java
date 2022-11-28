//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

package Seminar_1;

public class Lesson_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0 , 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 };
        int count = 0;
        int max = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 1) count++;
            else {
                count = 0;
            }
            if (count > max){
                max = count;
            }
        }
        System.out.printf("Максимальное количество подряд идущих единиц %s", max);
    }
}